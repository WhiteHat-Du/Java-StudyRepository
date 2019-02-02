package org.du.app.lee;

import org.du.app.service.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person p = context.getBean("person",Person.class);
		p.sayHi("ËïÎò¿Õ");
	}
}

