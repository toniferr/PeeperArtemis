package com.toni.ferreiro.PeeperArtemis.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiverService {
	
	Logger log = LoggerFactory.getLogger(ReceiverService.class);
	
	@JmsListener(destination = "${jms.queue}")
	public void receiverMessage(String message) {
		log.info("Receiver message " +message);
	}

}
