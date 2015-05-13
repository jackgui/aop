package com.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.BaseSerivce;

public class TestMain {

	
	private ApplicationContext context;

	@Test
	public void test(){
		context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
		BaseSerivce baseService = context.getBean(BaseSerivce.class);
		
		baseService.query();
		
	}
}
