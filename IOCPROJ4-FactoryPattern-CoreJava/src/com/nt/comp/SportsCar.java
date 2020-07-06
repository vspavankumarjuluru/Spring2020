package com.nt.comp;

public class SportsCar implements Car {
	Tyre tyre=null;
	@Override
	public void drive() {
		System.out.println("Driving Sports car  having"+tyre.roadGrip());
		
	}
	public SportsCar(Tyre tyre) {
		this.tyre=tyre;
	}

}
