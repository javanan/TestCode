package com.DesignPattern.Template.HibernateTemplate;

public class TempateMain {
	 //这里仅仅使用main作测试  
    public static void main(String[] args)  
    {  
        //传递：  
        //1.得到HibernateTemplate对象  
        //2.向HibernateTemplate.execute方法中传递HibernateCallback对象  
        //3.覆写HibernateCallback对象  
      
        BackCallTemplate getHibernateTemplate = new BackCallTemplate();  
        //我们使用的是回调函数，在回调函数里处理行为  
        //疑问：怎么才能调用getHibernateTempleate.save(X x)呢？  
        //答：可将Main方法进行封装，通过方法参数传递参数即可!  
        String str = (String) getHibernateTemplate.execute(new HibernateCallback()  
        {  
            public Object doInHibernate(Session session)  
            {  
                return session.createQuery("select count(id) from table");  
            }  
        });  
          
        System.out.println(str);  
    }  
}
