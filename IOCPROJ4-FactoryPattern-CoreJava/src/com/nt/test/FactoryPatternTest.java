package com.nt.test;

import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Car car=null;
		car=CarFactory.getInstance("Royal");
		System.out.println("-----------------------");
		car=CarFactory.getInstance("Budget");
		car.drive();
	}

}
