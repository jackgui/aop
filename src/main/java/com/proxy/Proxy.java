package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy implements InvocationHandler {

	private Object target ;
	
	public Proxy(Object target){
		this.target = target;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("开始代理");
		method.invoke(target, args);
		System.out.println("结束代理");
		return null;
	}

}
