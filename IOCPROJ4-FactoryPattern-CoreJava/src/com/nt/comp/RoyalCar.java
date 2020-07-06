package com.nt.comp;

public class RoyalCar implements Car {
	private Tyre tyre=null; 
	public RoyalCar(Tyre tyre) {
		this.tyre=tyre;
	}
	@Override
	public void drive() {
		System.out.println("Driving Royal car  having"+tyre.roadGrip());
	}


}
