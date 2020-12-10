package com.cognixia.jump.util.db;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import com.cognixia.jump.constants.Crud;

/***
 * This class helps produce a SQL inquiry String generically by using
 * class type, declared fields or ResultSetMetadata
 * 
 */

public class QueryManager {
	private static String sqlStatement;
	private Class<?> clazz;

	public QueryManager(Class<?> clazz) {
		this.clazz = clazz;
	}
	
	private static Crud operation;
	private String[] fields;
	
	public String[] getTableFieldNames() {
		String[] fields = null;
		try {
			Connection connection = ConnectionManager.getConnection();
			ResultSetMetaData rsmd;
			rsmd = connection.createStatement().executeQuery(Crud.READ.getPrefix() + clazz.getSimpleName()).getMetaData();
			fields = new String[rsmd.getColumnCount()];
			for (int i = 0; i < fields.length; i++) {
				fields[i] = rsmd.getColumnName(i+1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	return fields;
	}
	
	public <T> String getSQLStatement(Crud operation, boolean sameName) {
	
		StringBuilder sb = new StringBuilder();
		
		fields = null;
		if(sameName) {
			int count = 0;
			fields = new String[clazz.getDeclaredFields().length];
			for(Field field : clazz.getDeclaredFields()) {
				fields[count] = field.getName();
				count++;
			}
		}	else {
			fields = getTableFieldNames();
		} 
		
		switch (operation) {
		case CREATE:
			sb.append(operation.getPrefix() + clazz.getSimpleName() + " (");
			IntStream.range(0, fields.length).filter( i -> i!=0).forEach( i -> sb.append(fields[i]+","));
			sb.replace(sb.length()-1, sb.length()-0, ") " + operation.getNonpre() + "(");
			IntStream.range(0, fields.length).filter( i -> i!=0).forEach( i -> sb.append("?,"));
			sb.replace(sb.length()-1, sb.length()-0, ")");
			sqlStatement = sb.toString();
			break;
		case DELETE:
			sb.append(operation.getPrefix() + clazz.getSimpleName() + operation.getNonpre() + fields[0] + "=?");
			sqlStatement = sb.toString();
			break;
		case READ:
			sb.append(operation.getPrefix() + clazz.getSimpleName() + operation.getNonpre() + fields[0] + "=?");
			sqlStatement = sb.toString();
			break;
		case READ_ALL:
			sb.append(operation.getPrefix() + clazz.getSimpleName());
			sqlStatement = sb.toString();
			break;
		case UPDATE:
			sb.append(operation.getPrefix() + clazz.getSimpleName() + operation.getNonpre());
			IntStream.range(1, fields.length).
				forEach( i -> sb.append(fields[i] + "=?,"));
			sb.replace(sb.length()-1, sb.length(), Crud.READ.getNonpre() + fields[0] + "=?");
			sqlStatement = sb.toString();
			break;
		default:
			break;
		}	return sqlStatement;
	}
	
	public <T> String getSQLStatement(Crud operation, boolean sameName, int columnIndex) {
		if(columnIndex > clazz.getDeclaredFields().length) {
			System.out.println("ColumnIndex is out of bounds");
		} else { 
		
			StringBuilder sb = new StringBuilder();
			
			fields = null;
			if(sameName) {
				int count = 0;
				fields = new String[clazz.getDeclaredFields().length];
				for(Field field : clazz.getDeclaredFields()) {
					fields[count] = field.getName();
					count++;
				}
			}	else {
				fields = getTableFieldNames();
			} 
			
			switch (operation) {
			case READ:
				sb.append(operation.getPrefix() + clazz.getSimpleName() + operation.getNonpre() + fields[columnIndex-1] + "=?");
				sqlStatement = sb.toString();
				break;
			case UPDATE:
				sb.append(operation.getPrefix() + clazz.getSimpleName() + operation.getNonpre());
				IntStream.range(columnIndex-1, columnIndex).
				forEach( i -> sb.append(fields[i] + "=?,"));
				sb.replace(sb.length()-1, sb.length(), Crud.READ.getNonpre() + fields[0] + "=?");
				sqlStatement = sb.toString();
				break;
			default:
				break;
			}
		}	return sqlStatement;
	}
	
	public <T> String getSQLStatement(Crud operation, boolean sameName, String fieldName) {
		OptionalInt columnName = IntStream.range(0, clazz.getDeclaredFields().length).filter(i -> fieldName.equalsIgnoreCase(clazz.getDeclaredFields()[i].getName())).findFirst();
		if(columnName.isEmpty()) {
			System.out.println("field=" + fieldName +" was not found.");
		}	else { 
			Integer columnIndex = columnName.getAsInt() + 1;
		
			StringBuilder sb = new StringBuilder();
			
			fields = null;
			if(sameName) {
				int count = 0;
				fields = new String[clazz.getDeclaredFields().length];
				for(Field field : clazz.getDeclaredFields()) {
					fields[count] = field.getName();
					count++;
				}
			}	else {
				fields = getTableFieldNames();
			} 
			
			switch (operation) {
			case READ:
				sb.append(operation.getPrefix() + clazz.getSimpleName() + operation.getNonpre() + fields[columnIndex-1] + "=?");
				sqlStatement = sb.toString();
				break;
			case READ_ALL:
				sb.append(operation.getPrefix() + clazz.getSimpleName() + operation.getNonpre() + fields[columnIndex-1] + "=?");
				sqlStatement = sb.toString();
				break;
			case UPDATE:
				sb.append(operation.getPrefix() + clazz.getSimpleName() + operation.getNonpre());
				IntStream.range(columnIndex-1, columnIndex).
				forEach( i -> sb.append(fields[i] + "=?,"));
				sb.replace(sb.length()-1, sb.length(), Crud.READ.getNonpre() + fields[0] + "=?");
				sqlStatement = sb.toString();
				break;
			default:
				break;
			}
		}	return sqlStatement;
	}

	public static Crud getOperation() {
		return operation;
	}

	public static void setOperation(Crud operation) {
		QueryManager.operation = operation;
	}
}

