package com.nt.advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class CacheAdvice implements MethodInterceptor {

	private Map<String,Object> cacheMap=new HashMap();
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String key=null;
		Object retVal=null;
		
		key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
		
		if(!cacheMap.containsKey(key)) {
			retVal=invocation.proceed();
			cacheMap.put(key, retVal);
			System.out.println("From Target Method");			
		}else {
			retVal=cacheMap.get(key);
			System.out.println("From Cache");
		}
		
		return retVal;
	}

}
