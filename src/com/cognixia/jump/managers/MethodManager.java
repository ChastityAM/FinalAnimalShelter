package com.cognixia.jump.managers;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodManager { 
	 
	private MethodManager() {};

	public static Object invokeGetter(Object object, String variableName) {
		Object o = null;
		Method getter = null;
		PropertyDescriptor propDescriptor = null;
		try {
			if(variableName.equalsIgnoreCase("id")) {
				propDescriptor = new PropertyDescriptor(object.getClass().getDeclaredFields()[0].getName(), object.getClass());
			} else {
				propDescriptor = new PropertyDescriptor(variableName, object.getClass());
				
			}
			getter = propDescriptor.getReadMethod();
			o = getter.invoke(object);
		}	catch (IllegalArgumentException | IntrospectionException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}	return o;
	}

	
	
	
	public static Object invokeSetter(Object object, String propertyName, Object variableValue)	{
		Object o = null;
		PropertyDescriptor propDescriptor;
		try {
			propDescriptor = new PropertyDescriptor(propertyName, object.getClass());
			Method setter = propDescriptor.getWriteMethod();
			try {
				o = setter.invoke(object, variableValue);
			}	catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}	catch (IllegalArgumentException | IntrospectionException e) {
			e.printStackTrace();
		}	return o;
	}
	
}
