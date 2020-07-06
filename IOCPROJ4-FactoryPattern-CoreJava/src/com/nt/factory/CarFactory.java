package com.nt.factory;

import com.nt.comp.ApolloTyre;
import com.nt.comp.BudgetCar;
import com.nt.comp.CEATTyre;
import com.nt.comp.Car;
import com.nt.comp.MRFTyre;
import com.nt.comp.RoyalCar;
import com.nt.comp.SportsCar;
import com.nt.comp.Tyre;

public class CarFactory {
	public static Car getInstance(String type) {
		Car car=null;
		Tyre tyre=null;
		
		if(type.equalsIgnoreCase("Royal")) {
			tyre=new CEATTyre();
			car=new RoyalCar(tyre);
		}else if(type.equalsIgnoreCase("Budget")) {
			tyre=new ApolloTyre();
			car=new BudgetCar(tyre);
		}else if(type.equalsIgnoreCase("Sports")) {
			tyre=new MRFTyre();
			car=new SportsCar(tyre);
		}
		
		return car;
	}

}
