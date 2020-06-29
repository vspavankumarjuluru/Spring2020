package com.pavan.test;

public class TestApp1 {

	public static void main(String[] args) {
		Class c1=null,c2=null;
		Object obj1=null,obj2=null;
		
		try {
			c1=Class.forName(args[0]);
			obj1=c1.newInstance();
			System.out.println(obj1);
			c2=Class.forName(args[1]);
			obj2=c2.newInstance();
			System.out.println(obj2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
