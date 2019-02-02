package org.spring.test;

import org.spring.entity.AllCollectionType;
import org.spring.entity.Course;
import org.spring.entity.Student;
import org.spring.factory.CourseFactory;
import org.spring.newinstance.ICourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void SpringIoc()
	{
		//Spring�����Ķ��� ��context
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ֱ�Ӵ�Spring IOC�����л�ȡһ��idΪstudent�Ķ���
		Student student = (Student)context.getBean("student");
		System.out.println(student);
		//1.ʡ��new�ؼ��֣�������new����
		//2.�������Եĸ�ֵ
	}
	
	public static void LearnCourse()
	{
		Student student = new Student();
		student.LearnHtml();
		student.LearnJava();
	}
	
	public static void LearnCourseWithFactory()
	{
		Student student = new Student();
		student.Learn("html");
	}
	
	public static void LearnCourseWithIOC() {
		//��IOC�����л�ȡѧ������
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("student");
		student.Learn("htmlCourse");
	}
	
	public static void TestDI() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Course course = (Course)context.getBean("course");
		course.showInfo();
	}
	
	public static void collectionDemo() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AllCollectionType type = (AllCollectionType)context.getBean("collectionDemo");
		System.out.println(type);
	}
	public static void main(String[] args) 
	{
//		LearnCourseWithFactory();
//		LearnCourseWithIOC();
//		TestDI();
		collectionDemo();
	}

}
