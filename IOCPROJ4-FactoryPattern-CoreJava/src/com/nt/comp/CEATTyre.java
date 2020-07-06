package com.nt.comp;

public class CEATTyre implements Tyre {
	@Override
	public String roadGrip() {
		return "CEAT Tyre:: Standard Road Grip -->Suitable for any Transpotation";	}
	public CEATTyre() {
		System.out.println("CEATTyre::0-param constructor");
	}

}
