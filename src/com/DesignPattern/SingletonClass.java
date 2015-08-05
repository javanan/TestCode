package com.DesignPattern;

/**
 * 
 * @author chen
 *  单例设计模式，懒汉模式
 */
public class SingletonClass {
	private static SingletonClass instance = null;

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		if (instance == null) {
			synchronized (SingletonClass.class) {
				if (instance == null) {
					instance = new SingletonClass();
				}
			}
		}
		return instance;
	}
}
















