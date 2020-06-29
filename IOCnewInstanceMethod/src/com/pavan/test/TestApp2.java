package com.pavan.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestApp2 {

	public static void main(String[] args) {
		Class c1 = null, c2 = null;
		Constructor cons[];
		Object obj1 = null;

		try {
			c1 = Class.forName(args[0]);
			cons = c1.getDeclaredConstructors();
			obj1 = cons[0].newInstance(10, 20);
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
