package com.pavan.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;
	int hours=0;
	int year=0;
	int month=0;
	
	public void setYear(int year) {
		this.year = year;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public WishMessageGenerator(Date date) {
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
