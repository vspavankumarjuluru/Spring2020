package com.nt.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;


public class AroundAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		proxy=ctx.getBean("pfb",BankService.class);
		System.out.println(proxy.getClass()+"  "+Arrays.toString(proxy.getClass().getDeclaredMethods()));
		try {
			  System.out.println("1st Simple Intrest Amount::"+proxy.calcSimpleIntrestAmount(100000, 12,2 ));
			  System.out.println("...........................");
			  System.out.println("2nd Simple Intrest Amount::"+proxy.calcSimpleIntrestAmount(100000, 12,2 ));
			  System.out.println("==========================================================================");
			  System.out.println("1st compound Intrest amount::"+proxy.calcCompoundIntrestAmount(100000, 12,2));
			  System.out.println("...........................");
			  System.out.println("2nd compound Intrest amount::"+proxy.calcCompoundIntrestAmount(100000, 12,2));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		((AbstractApplicationContext)ctx).close();
	}

}
