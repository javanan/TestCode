package com.test;


/**
 * 单例模式  饿汗模式
 * @author chen
 *
 */
public  class Singleton {

	private static Singleton single=new Singleton();
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return single;
		
	}
}
