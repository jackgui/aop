package com.cglib;

import net.sf.cglib.proxy.Enhancer;

public class ServiceFactory {

	
	public static Object create(Object target){
		Enhancer enhancer = new Enhancer();
		
		enhancer.setCallback(new MyCglibProxy());
		
		enhancer.setSuperclass(target.getClass());
		
		return enhancer.create();
		
	}
}
