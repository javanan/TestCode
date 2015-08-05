package com.test;

import org.junit.Test;

public class FinalParameter {

	public final int a;
	 
	
	//类的范围内用 final 关键字修饰变量  要在构造函数中 赋值
	public FinalParameter(){
		a=0;
	}
	
	
	public static void main(String[] ars){
		final int b;
		test1(3);
	}
	public static void test1(final int i){
		//i++;
		System.out.println("===========i="+i);
	}
	
	@Test
	public void test2(){
		final int a;
		a=9;
		System.out.println("a="+a);
		//a=0;
		
		
	}
}
