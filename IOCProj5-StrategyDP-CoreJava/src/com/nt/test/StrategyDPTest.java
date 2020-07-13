package com.nt.test;

import com.nt.comp.FlipKart;
import com.nt.factory.FlipKartFactory;

public class StrategyDPTest {
	
	public static void main(String[] args) {
	    FlipKart fpkt=null;
	    fpkt=FlipKartFactory.getInstance("firstflight");
	    System.out.println(fpkt.shopping(new String[] {"rain coat","umbrella","flu tablets"} ,
	    		                                                    new float[] {5000,2000,500}
	                                                             )
	    		                        );

	}//main

}
