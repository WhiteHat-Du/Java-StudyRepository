package org.spring.entity;

import org.spring.factory.CourseFactory;
import org.spring.newinstance.ICourse;
import org.spring.newinstance.LearnJava;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.spring.newinstance.LearnHtml;

public class Student {
	
	private int stuNo ;
	private String stuName ;
	private int stuAge ;
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
	@Override
	public String toString() {
		return this.stuNo + "," + this.stuName + "," + this.stuAge;
	}
	
	//学习任何课程
	public void Learn(String name) {
		//course就是根据name拿到相应的课程
//		ICourse course = CourseFactory.getCourse(name);
		
		//直接从IOC容器中获取
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICourse course = (ICourse)context.getBean(name);
		course.Learn();
	}
	
	//学习Java课程
	public void LearnJava()
	{
		ICourse course = new LearnJava();
		course.Learn();
	}
	
	//学习Html课程
	public void LearnHtml()
	{
		ICourse course = new LearnHtml();
		course.Learn();
	}
}
