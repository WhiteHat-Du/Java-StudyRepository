package org.app.service.impl;

import org.app.service.Person;

public class Chinese implements Person{
	@Override
	public String sayHello(String name) {
		return name + "�����ã�";
	}
	@Override
	public String sayGoodBye(String name) {
		return name + "���´��ټ���";
	}
}
