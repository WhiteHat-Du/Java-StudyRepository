package org.app.service.impl;

import org.app.service.Being;

public class Dog implements Being{
	private String msg;
	//msg��setter����
	public void setMsg(String msg) {
		this.msg = msg;
	}
	//ʵ�ֽӿڱ���ʵ�ֵ�testBeing()����
	@Override
	public void testBeing() {
		System.out.println(msg + ",�����й�ͷ��");
	}
}
