package com.nt.comp;

public class BudgetCar implements Car{
	Tyre tyre=null;
	public BudgetCar(Tyre tyre) {
		this.tyre=tyre;
	}
	@Override
	public void drive() {
		System.out.println("Driving Budget car  having"+tyre.roadGrip());
		
	}
	
}
