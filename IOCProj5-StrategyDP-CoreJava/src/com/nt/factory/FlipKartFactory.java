package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FirstFlight;
import com.nt.comp.FlipKart;

public class FlipKartFactory {
	
	public    static  FlipKart   getInstance(String courierName) {
		  Courier courier=null;
		  FlipKart fpkt=null;
		  //create Dependent class object
		  if(courierName.equalsIgnoreCase("dtdc")) 
			  courier=new DTDC();
		  else if(courierName.equalsIgnoreCase("blueDart"))
			  courier=new BlueDart();
		  else if(courierName.equalsIgnoreCase("firstFlight"))
			  courier=new FirstFlight();
		  else 
			   throw new  IllegalArgumentException(" Invalid courier name");
		  //create Target class object
		  fpkt=new FlipKart();
		  //assign depedent class object to taget class object
		  fpkt.setCourier(courier);
		  
		  return  fpkt;
		
	}

}
