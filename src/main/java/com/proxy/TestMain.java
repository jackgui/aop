package com.proxy;

public class TestMain {

	public static void main(String[] args) {
		Interface inf = (Interface) BeanFactory.create(new MyInterface());
		inf.show();

	}

}
