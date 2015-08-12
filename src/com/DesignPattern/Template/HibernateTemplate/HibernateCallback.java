package com.DesignPattern.Template.HibernateTemplate;

/**
 * 建立HibernateTemplate回调函数  
 * @author jamen
 *
 */
public interface HibernateCallback {
	 //内部只有doInHibernate方法  
    public Object doInHibernate(Session session);  
}
