package com.DesignPattern.proxy;

public class SubjectImpl implements Subject{

	@Override
	public String doSomeThing() {
		System.out.println("do some thing....");
		return null;
	}

}
