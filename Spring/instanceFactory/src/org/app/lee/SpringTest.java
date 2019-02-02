package org.app.lee;

import org.app.service.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		Person p1 = context.getBean("chinese",Person.class);
		System.out.println(p1.sayHello("�����"));
		System.out.println(p1.sayGoodBye("��˽�"));
		Person p2 = context.getBean("american" , Person.class);
		System.out.println(p2.sayHello("�����"));
		System.out.println(p2.sayGoodBye("��˽�"));
	}
}
