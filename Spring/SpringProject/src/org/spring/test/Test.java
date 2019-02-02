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
		//Spring上下文对象 ：context
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//直接从Spring IOC容器中获取一个id为student的对象
		Student student = (Student)context.getBean("student");
		System.out.println(student);
		//1.省略new关键字，对象不再new生成
		//2.对象属性的赋值
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
		//从IOC容器中获取学生对象
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
