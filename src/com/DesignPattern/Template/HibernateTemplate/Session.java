package com.DesignPattern.Template.HibernateTemplate;

/**
 * //建立Session类为实际该类为sessionFactory创建  
 * @author jamen
 *
 */
public class Session {
	//这里只列出createQuery方法，实际存在save,update,load等方法  
    public Object createQuery(String hql)  
    {  
        System.out.println(hql);  
        return "添加成功";  
    }  
}
