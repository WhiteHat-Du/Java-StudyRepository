package org.du.app.listener;

import org.du.app.event.EmailEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailNotifier implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent evt) {
		//ֻ����EmailEvent,ģ�ⷢ��email֪ͨ
		if(evt instanceof EmailEvent) {
			EmailEvent emailEvent = (EmailEvent)evt;
			System.out.println("��Ҫ�����ʼ��Ľ��յ�ַ" + emailEvent.getAddress());
			System.out.println("��Ҫ�����ʼ�������" + emailEvent.getText());
		}else {
			//����ʱ�䲻���κδ���
			System.out.println("����ʱ�䣺" + evt);
		}
	}
}
