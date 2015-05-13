package com.cglib;

import org.junit.Test;

public class TestCglib {

	
	@Test
	public void test1(){
		BookService bs  = (BookService)ServiceFactory.create(new BookService());
		bs.create();
	}
}
