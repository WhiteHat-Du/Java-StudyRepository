package org.crazyit.service;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	public static void main(String[] args) throws Exception 
	{
		//����Spring����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		//��ȡidΪperson��Bean
		Person p = ctx.getBean("person", Person.class);
		//����useAxe()����
		p.useAxe();
				
	}

}
