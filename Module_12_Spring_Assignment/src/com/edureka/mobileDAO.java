 
package com.edureka;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class mobileDAO {
	HibernateTemplate template;
	SessionFactory factory1;

	public void setSessionFactory(SessionFactory factory) {
		template=new HibernateTemplate(factory);
		factory1 = factory;
	}

	public void saveEmployee(mobile e){
		template.save(e);
	}
	
    public void delete (int Id)
    {
    	Session session = factory1.openSession();    	
    	session.beginTransaction();
    	mobile m = (mobile) session.get(mobile.class, Id);
    	session.delete(m);
    	session.getTransaction().commit();    	
    }
    
    public void update (int Id, int price)
    {
    	Session session = factory1.openSession();    	
    	session.beginTransaction();
    	mobile m = (mobile) session.get(mobile.class, Id);
    	m.setPrice(price);
    	session.update(m);
    	session.getTransaction().commit();    	
    }

	

}

