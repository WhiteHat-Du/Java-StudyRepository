package org.du.app.listener;

import org.du.app.event.EmailEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailNotifier implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent evt) {
		//只处理EmailEvent,模拟发送email通知
		if(evt instanceof EmailEvent) {
			EmailEvent emailEvent = (EmailEvent)evt;
			System.out.println("需要发送邮件的接收地址" + emailEvent.getAddress());
			System.out.println("需要发送邮件的正文" + emailEvent.getText());
		}else {
			//其他时间不做任何处理
			System.out.println("其他时间：" + evt);
		}
	}
}
