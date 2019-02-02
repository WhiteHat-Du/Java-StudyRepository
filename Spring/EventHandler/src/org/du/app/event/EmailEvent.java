package org.du.app.event;

import org.springframework.context.ApplicationEvent;

public class EmailEvent extends ApplicationEvent{
	private String address ;
	private String text ;
	public EmailEvent(Object source) {
		super(source);
	}
	//��ʼ��ȫ����Ա�����Ĺ�����
	public EmailEvent(Object source , String address , String text) {
		super(source);
		this.address = address ; 
		this.text = text ;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
