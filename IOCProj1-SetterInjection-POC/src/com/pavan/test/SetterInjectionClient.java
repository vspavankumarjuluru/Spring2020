package com.pavan.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.pavan.beans.WishMessageGenerator;

public class SetterInjectionClient {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishMessageGenerator generator=null;
		String result=null;
		
		System.out.println("ConstructorInjectionClient.main()");
		
		//res=new FileSystemResource("C:\\Users\\Harsha vardhan\\Spring2020-workspace\\IOCProj1-SetterInjection-POC\\src\\com\\pavan\\cfgs\\applicationContext.xml");
		res=new FileSystemResource("./src/com/pavan/cfgs/applicationContext.xml");
		factory=new XmlBeanFactory(res);
		obj=factory.getBean("wmg");
		generator=(WishMessageGenerator)obj;
		result=generator.generateWishMsg("pavan");
		System.out.println("Wish Message is:"+result);
	}

}
