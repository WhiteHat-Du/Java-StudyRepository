package org.spring.factory;

import org.spring.newinstance.ICourse;
import org.spring.newinstance.LearnHtml;
import org.spring.newinstance.LearnJava;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//�γ̹���
public class CourseFactory {
	//�������ֻ�ȡ�γ�
	public static ICourse getCourse(String name) {
		//��ȡIOC����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		if(name.equals("java")) {
			return (ICourse)context.getBean("javaCourse");
		}else {
			return (ICourse)context.getBean("htmlCourse");
		}
	}
}
