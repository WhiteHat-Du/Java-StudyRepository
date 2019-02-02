package org.du.app.service;

import java.util.Locale;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements ApplicationContextAware{
	//�ó�Ա�������������ڵ�ApplicationContext����
	private ApplicationContext ctx;
	/*
	 * Spring�����������������е�Bean���������ĳ��Beanʵ����ApplicationContextAware�ӿڣ�
	 * Spring�������ڴ�����Bean֮���Զ����ø÷��������ø÷���ʱ���Ὣ����������Ϊ���������÷�����
	 */
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		// TODO Auto-generated method stub
		this.ctx = ctx ;
	}
	
	public void sayHi(String name) {
		System.out.println(name);
		System.out.println(ctx.getMessage("hello", new String[] {name}, Locale.getDefault(Locale.Category.FORMAT)));
	}
}