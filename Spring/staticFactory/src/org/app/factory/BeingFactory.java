package org.app.factory;

import org.app.service.Being;
import org.app.service.impl.Cat;
import org.app.service.impl.Dog;

public class BeingFactory {
	//返回Being实例的静态工厂方法
	//arg参数决定返回那个Being类的实例
	public static Being getBeing(String arg) {
		//调用此静态方法的参数为dog，则返回Dog实例
		if(arg.equalsIgnoreCase("dog")) {
			return new Dog();
		}else {
			//否则返回Cat实例
			return new Cat();
		}
	}
}
