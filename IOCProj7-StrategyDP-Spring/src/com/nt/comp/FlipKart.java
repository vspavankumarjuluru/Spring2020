package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class FlipKart {
	private Courier courier;

	public FlipKart(Courier courier) {
		System.out.println("Flipkart:: 1-param constructor");
		this.courier = courier;
	}
	public FlipKart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	
	public  String  shopping(String[] items,float[] prices) {
		System.out.println("Flipkart.shopping()");
		 float billAmt=0.0f;
		 int oid=0;
		 String msg=null;
		 Random rad=null;
		//calculate  bill Amount
		 
		 for(float p:prices) 
			// billAmt=billAmt+p;
			 billAmt+=p;
		 //generate  order id dynamically as random number
		 rad=new Random();
		 oid= rad.nextInt(10000);
		 // use courier service for delivering the  products
		 msg=courier.deliver(oid);
		 // retrun bill Amt and courier details to customer
		return  Arrays.toString(items)+" are purchased  having prices "+Arrays.toString(prices)+"  with bill amount"+billAmt+ "----"+ msg;
	}

}
