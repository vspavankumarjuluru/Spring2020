package com.pavan.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.pavan.beans.WishMessageGenerator;

public class ConstructorInjectionClient {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		String result=null;
		
		System.out.println("ConstructorInjectionClient.main()");
		
		//res=new FileSystemResource("C:\\Users\\Harsha vardhan\\Spring2020-workspace\\IOCProj1-SetterInjection-POC\\src\\com\\pavan\\cfgs\\applicationContext.xml");
		res=new FileSystemResource("./src/com/pavan/cfgs/applicationContext.xml");
		factory=new XmlBeanFactory(res);
		generator=(WishMessageGenerator)factory.getBean("wmg");
		System.out.println("Wish Message is:"+generator.generateWishMsg("Pavan"));
	}

}
