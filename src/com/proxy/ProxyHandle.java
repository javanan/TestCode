package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandle implements InvocationHandler {

	private Object proxyObject;

	public ProxyHandle(Object proxyObject) {
		this.proxyObject = proxyObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// 在转调具体目标对象之前，可以执行一些功能处理
		System.out.println(method.getName()+"执行代理之前调用....");
		// 转调具体目标对象的方法
		Object proObject = method.invoke(proxyObject, args);

		// 在转调具体目标对象之后，可以执行一些功能处理
		System.out.println(method.getName()+"执行代理之后调用....");
		return proObject;
	}

}
