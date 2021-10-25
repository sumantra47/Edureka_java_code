 
package com.edureka; 


import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientTest {
public static void main(String[] args) {
	
	//table creation create table mobile (manuf_name varchar(25), price integer, color varchar(25)); 
	
	Resource r=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	
	mobileDAO dao=(mobileDAO)factory.getBean("d");
	
	mobile e=new mobile();
    e.setManuf_name("Nokia");
    e.setColor("Red");
    e.setPrice(1000);
	
	dao.saveEmployee(e);
	System.out.println("Record inserted...");

	e.setManuf_name("Samsung");
    e.setColor("Green");
    e.setPrice(2000);
    dao.saveEmployee(e);
	System.out.println("Record inserted...");
	
 	
}
}
