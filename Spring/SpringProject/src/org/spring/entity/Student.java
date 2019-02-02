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
	
	//ѧϰ�κογ�
	public void Learn(String name) {
		//course���Ǹ���name�õ���Ӧ�Ŀγ�
//		ICourse course = CourseFactory.getCourse(name);
		
		//ֱ�Ӵ�IOC�����л�ȡ
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICourse course = (ICourse)context.getBean(name);
		course.Learn();
	}
	
	//ѧϰJava�γ�
	public void LearnJava()
	{
		ICourse course = new LearnJava();
		course.Learn();
	}
	
	//ѧϰHtml�γ�
	public void LearnHtml()
	{
		ICourse course = new LearnHtml();
		course.Learn();
	}
}
