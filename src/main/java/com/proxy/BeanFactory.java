package com.proxy;

import java.lang.reflect.Proxy;

public class BeanFactory {

	
	public static Object create(Object target){
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), new com.proxy.Proxy(target));
	}
}
