package com.icc.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.icc.controller.CricketerController;
import com.icc.vo.CricketerVO;

public class CricketerAvgTest {

	public static void main(String[] args) {
		Scanner sc = null;
		String name = null, runsScored = null, noOfTimesOut = null, noOfRunsConceded = null, wicketsTaken = null;
		CricketerVO vo = null;
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		CricketerController controller = null;
		String result = null;
		// read inputs
		sc = new Scanner(System.in);
		System.out.println("enter Cricketername :: ");
		name = sc.next();
		System.out.println("enter runsScored :: ");
		runsScored = sc.next();
		System.out.println("enter noOfTimesOut :: ");
		noOfTimesOut = sc.next();
		System.out.println("enter noOfRunsConceded :: ");
		noOfRunsConceded = sc.next();
		System.out.println("enter wicketsTaken :: ");
		wicketsTaken = sc.next();
		
		vo = new CricketerVO();
		vo.setCricketerName(name);
		vo.setRunsScored(runsScored);
		vo.setNoOfTimesOut(noOfTimesOut);
		vo.setNoOfrunsConcedded(noOfRunsConceded);
		vo.setWicketsTaken(wicketsTaken);
		
		// create BEanFacory IOC container
				factory = new DefaultListableBeanFactory();
				reader = new XmlBeanDefinitionReader(factory);
				reader.loadBeanDefinitions("com/icc/cfgs/applicationContext.xml");
				// get Controller Bean class object..
				controller = factory.getBean("controller", CricketerController.class);
				// invoke the method
				try {
					result = controller.ProcessCricketer(vo);
					System.out.println(result);
				} catch (Exception e) {
					System.out.println("Internal Problem");
					e.printStackTrace();
				}
	}

}
