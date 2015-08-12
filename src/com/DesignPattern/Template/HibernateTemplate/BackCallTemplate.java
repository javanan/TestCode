package com.DesignPattern.Template.HibernateTemplate;

public class BackCallTemplate {
	// 这里是执行的方法
	public Object execute(HibernateCallback backCall) {
		// 这个方法的请求处理交给doExceute;
		return doExecute(backCall);
	}

	// 它来做请求处理
	public Object doExecute(HibernateCallback action) {
		// 首先去判断是否已经有一个session对象，如果没有则创建一个,存在就返回Session对象
		// Session session = (enforceNewSession
		// ?SessionFactoryUtils.getNewSession(getSessionFactory(),
		// getEntityInterceptor()) : getSession());
		Session session = new Session();
		// 这里执行架设函数
		return action.doInHibernate(session);
	}
}
