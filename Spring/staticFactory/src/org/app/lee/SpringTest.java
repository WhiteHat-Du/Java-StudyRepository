package org.app.lee;

import org.app.service.Being;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// 以类加载路径下的beans.xml配置文件创建Spring容器
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		Being b1 = context.getBean("dog" , Being.class);
		b1.testBeing();
		Being b2 = context.getBean("cat" , Being.class);
		b2.testBeing();
	}

}
