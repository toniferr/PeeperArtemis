package com.toni.ferreiro.PeeperArtemis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class DispatcherService {

	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${jms.queue}")
	String queueMessage;
	
	public void sendMessage(String message) {
		jmsTemplate.convertAndSend(queueMessage, message);
	}
}
