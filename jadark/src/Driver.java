package src;

import java.awt.Component;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Driver {

	JFrame ob;
	Class obClass;
	ArrayList methods, parameters;
	Component comp;
	
	public Driver()
	{
		//Temporary
		ob = new JFrame();
		//
		
		
		obClass = Sniffer.classify(ob);
		
		methods = Sniffer.methodology(obClass);
		
		parameters = Sniffer.parameter((Method) methods.get(39));
		
		System.out.println(methods.get(39));
		System.out.println(parameters.get(0));
		
		//System.out.println(parameters.get(0));
		
		Method method = (Method) methods.get(39);
		Individual individual = new Individual(parameters);
		individual.randomize();
		individual.readGenome();
		
		try {
			method.invoke(obClass.newInstance(), 5);
		} catch (IllegalAccessException e) {
			// Method cannot be accessed with current privilege
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// The argument is illegal, discourage use in future
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// The method was successfully invoked and encountered an error
			e.printStackTrace();
		} catch (InstantiationException e) {
			// The class instantiation failed
			e.printStackTrace();
		} 
		
	}

	
	
	public static void main(String[] args){
	new Driver();	
	}
	
	
}
