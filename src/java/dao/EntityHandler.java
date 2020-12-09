package com.cognixia.jump.dao.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.constants.Crud;
import com.cognixia.jump.dao.abstracts.AbstractDAO;
import com.cognixia.jump.util.db.ConnectionManager;
import com.cognixia.jump.util.db.QueryManager;
import com.cognixia.jump.util.reflection.MethodManager;



public class EntityHandler<T,PK> extends AbstractDAO<T,PK> {
	private static QueryManager queryManager;
	public EntityHandler(Class<T> entityClass) {
		super(entityClass);
		EntityHandler.queryManager = new QueryManager(getEntityClass());
	}
	 

	@Override
	public Boolean create(T t) {
		try {
			connection = ConnectionManager.getConnection();
			preparedStatement = connection.prepareStatement(queryManager.getSQLStatement(Crud.CREATE, false));

			for (int i = 1; i < fields.length; i++) {
				preparedStatement.setObject(i, MethodManager.invokeGetter(t, fields[i].getName()));
			}
			
			int rowsInserted = preparedStatement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new " + getEntityClass().getSimpleName() + " was registered.");
			    return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 	return false;
	}

	@Override
	public T readById(PK id) {
		T t = null;
		
		try {
			connection = ConnectionManager.getConnection();
			sql = queryManager.getSQLStatement(Crud.READ, false);
			preparedStatement = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			preparedStatement.setObject(1, id);
		
			resultSet = preparedStatement.executeQuery();
			if	(!resultSet.next()) { 
				System.out.println(getEntityClass().getSimpleName() + " with id=" + id + " was not found.");
			}	else {
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					t = getEntityClass().getDeclaredConstructor().newInstance();
					for (int i = 0; i < fields.length; i++) {
						MethodManager.invokeSetter(t, fields[i].getName(), resultSet.getObject(i+1));
					}
				}	
			}
		} 	catch (SQLException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}	finally {
			try {
				preparedStatement.close();
				resultSet.close();
				connection.close(); 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 	return t;
	}
	 
	@Override
	public T readByAttribute(Integer attributeIndex, Object value) {
		T t = null;
		if(attributeIndex!=0 && attributeIndex<=fields.length) {
			try {
				connection = ConnectionManager.getConnection();
				sql = queryManager.getSQLStatement(Crud.READ, false, attributeIndex);
				if(sql!=null) {
					preparedStatement = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
					preparedStatement.setObject(1, value);
					resultSet = preparedStatement.executeQuery();
					if	(!resultSet.next()) { 
					System.out.println(getEntityClass().getSimpleName() + " with " + fields[attributeIndex-1].getName() + "=" + value + " was not found.");
					}	else {
						resultSet.beforeFirst();
						while(resultSet.next()) {
							t = getEntityClass().getDeclaredConstructor().newInstance();
							for (int i = 0; i < fields.length; i++) {
								MethodManager.invokeSetter(t, fields[i].getName(),resultSet.getObject(i+1));
							}
						}		
					}
				}					
			} 	catch (SQLException | IllegalArgumentException | SecurityException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
				e.printStackTrace();
			}	finally {
				try {
					if(sql!=null) {
						preparedStatement.close();
						resultSet.close();
					}	connection.close(); 
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}	
		}	else {
			System.out.println("AttributeIndex cannot be zero or greater than the number of fields/columns.");
		}	return t;
	}
	
	@Override
	public T readByAttribute(String attributeName, Object value) {
		T t = null;
		if(attributeName!=null && !attributeName.isBlank()) {
			try {
				connection = ConnectionManager.getConnection();
				sql = queryManager.getSQLStatement(Crud.READ, false, attributeName);
				if(sql!=null) {
					preparedStatement = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
					preparedStatement.setObject(1, value);
					resultSet = preparedStatement.executeQuery();
					if	(!resultSet.next()) { 
						System.out.println(getEntityClass().getSimpleName() + " with " + attributeName + "=" + value + " was not found.");
					}	else {
						resultSet.beforeFirst();
						while(resultSet.next()) {
							t = getEntityClass().getDeclaredConstructor().newInstance();
							for (int i = 0; i < fields.length; i++) {
								MethodManager.invokeSetter(t, fields[i].getName(),resultSet.getObject(i+1));
							}
						}		
					}
				}					
			} 	catch (SQLException | IllegalArgumentException | SecurityException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
				e.printStackTrace();
			}	finally {
				try {
					if(sql!=null) {
						preparedStatement.close();
						resultSet.close();
					}	connection.close(); 
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}	
		}	else {
			System.out.println("attributeName cannot be null or blank.");
		}
		return t;
	}
	
	@Override
	public List<T> readAll() {
		List<T> list = null;
		try {
			connection = ConnectionManager.getConnection();
			preparedStatement = connection.prepareStatement(queryManager.getSQLStatement(Crud.READ_ALL, false));
			resultSet = preparedStatement.executeQuery();
			
			list = resultSet==null? null:new ArrayList<T>();
		
			while(resultSet.next()) {
				t = getEntityClass().getDeclaredConstructor().newInstance();
				for (int i = 0; i < fields.length; i++) {
					MethodManager.invokeSetter(t, fields[i].getName(),resultSet.getObject(i+1));
				}	list.add(t);
			}
		} 	catch (SQLException | IllegalArgumentException | SecurityException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			e.printStackTrace();
		}	finally {
			try {
				preparedStatement.close();
				resultSet.close();
				connection.close(); 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	return list;
	}
	
	@Override
	public List<T> readAllByAttribute(String attributeName, Object value) {
		List<T> list = null;
		if(attributeName!=null && !attributeName.isBlank()) {
			try {
				sql = queryManager.getSQLStatement(Crud.READ_ALL, false, attributeName);
				
				if(sql != null) { 
					connection = ConnectionManager.getConnection();
					preparedStatement = connection.prepareStatement(queryManager.getSQLStatement(Crud.READ_ALL, false, attributeName));
					preparedStatement.setObject(1, value);
					resultSet = preparedStatement.executeQuery();
					list = resultSet==null? null:new ArrayList<T>();
					if(list!=null) {
						while(resultSet.next()) {
							t = getEntityClass().getDeclaredConstructor().newInstance();
							for (int i = 0; i < fields.length; i++) {
								MethodManager.invokeSetter(t, fields[i].getName(),resultSet.getObject(i+1));
							}	list.add(t);
						}
					}
				} 	
			} catch (SQLException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			
			
		}	else {
			System.out.println("AttributeName cannot be null or blank.");
		}
		return list;
	}
	
	@Override
	public List<T> readAllByAttribute(Integer attributeIndex, Object value) {
		List<T> list = null;
		if(attributeIndex!=0 && attributeIndex<=fields.length) {
			try {
				sql = queryManager.getSQLStatement(Crud.READ, false, attributeIndex);
			
				if(sql != null) { 
					connection = ConnectionManager.getConnection();
					preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setObject(1, value);
					resultSet = preparedStatement.executeQuery();
					list = resultSet==null? null:new ArrayList<T>();
					if(list!=null) {
						while(resultSet.next()) {
							t = getEntityClass().getDeclaredConstructor().newInstance();
							for (int i = 0; i < fields.length; i++) {
								MethodManager.invokeSetter(t, fields[i].getName(),resultSet.getObject(i+1));
							}	list.add(t);
						}
					}
				} 	
			} catch (SQLException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
		}	else {
			System.out.println("AttributeIndex cannot be zero or greater than the number of fields/columns.");
		}	return list;
	}
	
	@Override 
	public Integer update(T t) {
		Integer updated = 0;
		try {
			connection = ConnectionManager.getConnection();
			preparedStatement = connection.prepareStatement(queryManager.getSQLStatement(Crud.UPDATE, false));
			
			for (int i = 1; i < fields.length; i++) {
				preparedStatement.setObject(i, MethodManager.invokeGetter(t, fields[i].getName()));
			}	preparedStatement.setObject(fields.length, MethodManager.invokeGetter(t, fields[0].getName()));
			
			updated = preparedStatement.executeUpdate();
			
			if(updated > 0) {
				System.out.println
				(getEntityClass().getSimpleName() + " with Id=" + MethodManager.invokeGetter(t, fields[0].getName()) + " was updated.");
			}
			
		}	catch(SQLException e) {
			e.printStackTrace();
		}	return updated;
	}

	@Override
	public Integer updateAttribute(PK id, Integer attribute, Object object) {
		Integer updated = 0;
		try {
			connection = ConnectionManager.getConnection();
			sql = queryManager.getSQLStatement(Crud.UPDATE, false, attribute);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, object);
			preparedStatement.setObject(2, id);
			updated = preparedStatement.executeUpdate();
			
			if(updated > 0) {
				System.out.println(getEntityClass().getSimpleName() + " with Id=" + id + " was updated.");
			}
			
		}	catch(SQLException e) {
			e.printStackTrace();
		}	return updated;
	}
	
	@Override
	public Integer updateAttribute(PK id, String attributeIndex, Object object) {
		Integer updated = 0;
		try {
			connection = ConnectionManager.getConnection();
			preparedStatement = connection.prepareStatement(queryManager.getSQLStatement(Crud.UPDATE, false, attributeIndex));
			preparedStatement.setObject(1, object);
			preparedStatement.setObject(2, id);
			updated = preparedStatement.executeUpdate();
			
			if(updated > 0) {
				System.out.println(getEntityClass().getSimpleName() + " with Id=" + id + " was updated.");
			}
			
		}	catch(SQLException e) {
			e.printStackTrace();
		}	return updated;
	}
	
	@Override
	public Boolean delete(T t) {
		if(MethodManager.invokeGetter(t, "id")==null) {
			System.out.println("Nothing to delete");
		}	else {
			Integer deleted = 0;
			try {
				connection = ConnectionManager.getConnection();
				preparedStatement = connection.prepareStatement(queryManager.getSQLStatement(Crud.DELETE, false));
				preparedStatement.setObject(1, MethodManager.invokeGetter(t, "id"));
				
				deleted = preparedStatement.executeUpdate();
				
				if(deleted > 0) {
					 System.out.println
					 (getEntityClass().getSimpleName() + " with Id=" + MethodManager.invokeGetter(t, fields[0].getName()) + " was deleted.");
					 return true;
				}
			}	catch(SQLException e) {
				e.printStackTrace();
			}	
		}
		return false;
	}

	@Override
	public Boolean deleteById(PK id) {
		Integer deleted = 0;
		try {
			connection = ConnectionManager.getConnection();
			preparedStatement = connection.prepareStatement(queryManager.getSQLStatement(Crud.DELETE, false));
			preparedStatement.setObject(1, id);

			deleted = preparedStatement.executeUpdate();
			
			if(deleted > 0) {
				System.out.println(getEntityClass().getSimpleName() + " with Id=" + id + " was deleted.");
				return true;
			}
		}	catch(SQLException e) {
			e.printStackTrace();
		}	return false;
	}


	
}
