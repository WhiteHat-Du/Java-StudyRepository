package org.crazyit.service;

public class Person {
	private Axe axe;
	//����ע�������setter����
	public void setAxe(Axe axe)
	{
		this.axe = axe;
	}
	public void useAxe()
	{
		System.out.println("�Ҵ���ȥ������");
		//����axe��chop()������
		//����Person����������axe����
		System.out.println(axe.chop());
	}
}
