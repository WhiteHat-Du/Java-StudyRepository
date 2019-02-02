package org.du.app.lee;

import org.du.app.event.EmailEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//����һ��ApplicationEvent����
		EmailEvent ele = new EmailEvent("test" , 
				"Spring_test@163.com" , "this is a test");
		//���������¼�
		context.publishEvent(ele);
	}
}
