package org.app.service.impl;

import org.app.service.Being;

public class Cat implements Being{
	private String msg;
	//msg的setter方法
	public void setMsg(String msg) {
		this.msg = msg;
	}
	//实现接口必须实现的testBeing()方法
	@Override
	public void testBeing() {
		System.out.println(msg + ",猫喜欢吃鱼！");
	}
}
