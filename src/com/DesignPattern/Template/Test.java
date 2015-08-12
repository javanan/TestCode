package com.DesignPattern.Template;

public class Test {

	@org.junit.Test
	public void TeaTest(){
		new Tea().create();
	}
	
	@org.junit.Test
	public void CoffeeTest(){
		new Coffee().create();
	}
}
