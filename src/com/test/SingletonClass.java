package com.test;

public class SingletonClass {

	private static SingletonClass single = null;

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		if (single == null) {
			synchronized (SingletonClass.class) {
				if (single == null) {
					single = new SingletonClass();
				}
			}
		}
		return single;
	}
}
