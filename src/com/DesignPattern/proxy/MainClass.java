package com.DesignPattern.proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class MainClass {
/**
 * 动态代理
 * @param args
 */
	@Test
	public  void main() {
		Subject subject = new SubjectImpl();
		Subject subjectProXy =	(Subject) Proxy.newProxyInstance(SubjectImpl.class.getClassLoader(),
				new Class[] { Subject.class }, new ProxyHandle(subject));
		
		subjectProXy.doSomeThing();
	}
}
