package com.cognixia.jump.dao.abstracts;

import java.util.List;

public interface DAO<T, PK> {
	//create
	public Boolean create(T t);
	//read
	public T readById(PK id);
	public T readByAttribute(Integer attributeIndex, Object value);
	public T readByAttribute(String attributeName, Object value);
	public List<T> readAll();
	public List<T> readAllByAttribute(Integer attributeIndex, Object value);
	public List<T> readAllByAttribute(String attributeName, Object value);
	//update
	public Integer update(T t);
	public Integer updateAttribute(PK id, Integer attributeIndex, Object value);
	public Integer updateAttribute(PK id, String attributeName, Object value);
	//delete
	public Boolean delete(T t);
	public Boolean deleteById(PK id);
}
