package com.xq.woa.back.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;

public class JmsProducer {
	
	private static Logger logger = LoggerFactory.getLogger(JmsProducer.class);
	private JmsTemplate jmsTemplate;
	
	public void sendMsg(String destinationName, String message){
		try {
			//jmsTemplate.convertAndSend(destinationName, message);
		} catch (Exception e) {
			logger.error("send msg error dest:"+destinationName);
			e.printStackTrace();
		}
		
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}
	
	
}
