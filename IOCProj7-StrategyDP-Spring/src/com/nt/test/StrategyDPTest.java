package com.nt.test;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.comp.FlipKart;

public class StrategyDPTest {
	
	public static void main(String[] args) {
		BeanFactory factory=null;
		ClassPathResource res=null;
		FlipKart  fpkt=null;
		// hold  spring bean cfg file
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//create  IOC container
		factory=new XmlBeanFactory(res);
		//get Taget Bean object
		fpkt=factory.getBean("fpkt",FlipKart.class);
		//invoke the methods
		System.out.println(fpkt.shopping(new String[] {"PPEKit"," MASK","Sanitizer"},new float[] {2000,500,200}));
	}//main

}
