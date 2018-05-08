package src;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class Sniffer {

	/*
	 * Sniffer class uses the Reflect library to .classify(), .methodology(), and .parameter();
	 * 
	 * .classify(Object ob) 
	 *  returns the class of obect ob
	 * .methodology(Class c)
	 *  returns an ArrayList of Methods accessible by Class c
	 * .parameter(Method method)
	 *  returns an ArrayList of Parameters possible for Method method
	 */
	
	public Sniffer(){}
	
	
	public static Class classify(Object ob){
	Class c = ob.getClass();
	return c;
	}
	
	public static ArrayList methodology(Class c) {
		ArrayList<Method> methods = new ArrayList<Method>();
		for (Method method : c.getMethods()) //getDeclaredMethods for only class specific
			methods.add(method);
			return methods;
	}
	
	public static ArrayList<Class> parameter(Method method){
		ArrayList<Class> parameters = new ArrayList<Class>();
		for (Class<?> para : method.getParameterTypes())
			parameters.add(para);
		return parameters;
	}
	
	public static ArrayList<Field> fields(Class parameter){
		ArrayList<Field> fieldsList = new ArrayList<Field>();
		for (Field field : parameter.getFields())
			fieldsList.add(field);
		return fieldsList;
	}
	
}


	