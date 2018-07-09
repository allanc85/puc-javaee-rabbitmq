package com.javaee.amr.rabbitmq.services;

import com.javaee.amr.rabbitmq.domain.Message;

public interface MessageService {
	
	void sendMessage(Message message);

}
