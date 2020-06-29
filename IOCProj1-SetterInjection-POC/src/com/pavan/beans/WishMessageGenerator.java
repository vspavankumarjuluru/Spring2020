package com.pavan.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;
	int hours=0;
	
		
	public void setDate(Date date) {
		this.date = date;
	}

	public String generateWishMsg(String user) {
		hours=date.getHours();
		if(hours<12)
		return "Good Morning:"+user;
		else if(hours<16)
			return "Good Afternoon:"+user;
		else if(hours<20)
			return "Good Evening:"+user;
		else
			return "Good Night:"+user;
		//System.out.println("Date is:"+date);
	}
	
	

}
