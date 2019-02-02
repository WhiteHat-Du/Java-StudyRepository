package org.app.factory;

import org.app.service.Being;
import org.app.service.impl.Cat;
import org.app.service.impl.Dog;

public class BeingFactory {
	//����Beingʵ���ľ�̬��������
	//arg�������������Ǹ�Being���ʵ��
	public static Being getBeing(String arg) {
		//���ô˾�̬�����Ĳ���Ϊdog���򷵻�Dogʵ��
		if(arg.equalsIgnoreCase("dog")) {
			return new Dog();
		}else {
			//���򷵻�Catʵ��
			return new Cat();
		}
	}
}
