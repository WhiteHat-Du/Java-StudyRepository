package org.du.app.lee;

import org.du.app.event.EmailEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//创建一个ApplicationEvent对象
		EmailEvent ele = new EmailEvent("test" , 
				"Spring_test@163.com" , "this is a test");
		//发布容器事件
		context.publishEvent(ele);
	}
}
