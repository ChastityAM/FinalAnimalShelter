package com.cognixia.jump.dao.abstracts;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class AbstractDAO<T,PK> implements DAO<T,PK> {
 
	protected static PreparedStatement preparedStatement = null;
	protected Connection connection = null;
	protected static Statement statement = null;
	protected static ResultSet resultSet = null;
	
	protected static Integer rowsInserted = null;
	protected static Field[] fields = null;
	protected static String sql = null;
	protected Class<T> entityClass;
	protected T t = null; 
	
	public AbstractDAO(final Class<T> entityClass) {
		this.entityClass = entityClass;
		fields = getEntityClass().getDeclaredFields();
	}
	
	public Class<T> getEntityClass() {
		return entityClass;
	}
	
	public void setEntityClass(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
}
