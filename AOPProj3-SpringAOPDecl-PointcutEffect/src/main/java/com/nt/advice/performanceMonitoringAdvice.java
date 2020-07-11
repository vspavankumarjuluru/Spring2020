package com.nt.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class performanceMonitoringAdvice implements MethodInterceptor{
@Override
public Object invoke(MethodInvocation invocation) throws Throwable {
	System.out.println("performanceMonitoringAdvice.invoke()"+invocation.getClass());
	long start=0,end=0;
	Object  retVal=null;
	
	if(invocation.getMethod().getName().equalsIgnoreCase("CalcCompoundInterest")) {
		start=System.currentTimeMillis();
		retVal=invocation.proceed();
		end=System.currentTimeMillis();
		System.out.println(invocation.getMethod().getName()+"with args"+Arrays.toString(invocation.getArguments())+"has taken:"+(end-start)+"ms");
	}else {
		retVal=invocation.proceed();		
	}
		
	return retVal;
}
}
