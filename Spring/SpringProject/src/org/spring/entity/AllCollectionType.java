package org.spring.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AllCollectionType {
	private List<String> list;
	private String[] array;
	private Set<String> set;
	private Map<String,String> map;
	private Properties pros;
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public String[] getArray() {
		return array;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	@Override
	public String toString() {
		//["aa","bb","cc"]
		String strContent = "";
		for(String str : array) {
			strContent += str + ",";//aa,bb,cc,
		}
		return  "List:" + this.list 
			+ "\nSet:" + this.set 
			+ "\nMap:" + this.map 
			+ "\nPros" + this.pros 
			+"\nArray:"+ strContent;
	}
}
