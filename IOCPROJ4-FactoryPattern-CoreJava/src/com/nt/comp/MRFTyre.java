package com.nt.comp;

public class MRFTyre implements Tyre{
public MRFTyre() {
System.out.println("0-param constructor");
}
@Override
	public String roadGrip() {
	return "MRF Tyre:: Standard Road Grip -->Suitable for any Transpotation";
	}

}
