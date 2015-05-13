package com.aop.service;

import org.springframework.stereotype.Service;

@Service
public class BaseSerivce {

	public void query() {
		System.out.println(this.getClass().getName());
		Object obj = null;
		System.out.println(obj.getClass());
	}
}
