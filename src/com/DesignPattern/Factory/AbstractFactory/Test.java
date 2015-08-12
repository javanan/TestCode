package com.DesignPattern.Factory.AbstractFactory;

import org.hamcrest.Factory;

public class Test {

	@org.junit.Test
	public void  testInvoke(){
		 //创建一个具体工厂 
	      IFactory factory = new FruitFactory(); 
	    //根据参数中具体产品的.class名称来决定创建的产品类型 
	      Iproduct product01 = factory.createProduct(Apple.class); 
	      Iproduct product02 = factory.createProduct(Banana.class); 
	        
	      product01.method1();
	      product01.method2();
	      product02.method1();
	      product02.method2();
	}
}
