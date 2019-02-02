package org.app.factory;

import org.app.service.Person;
import org.app.service.impl.American;
import org.app.service.impl.Chinese;

public class PersonFactory {
	public Person getPerson(String ethnic) {
		if(ethnic.equalsIgnoreCase("chinese")) {
			return new Chinese();
		}else {
			return new American();
		}
	}
}
