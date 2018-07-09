package com.javaee.amr.rabbitmq.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.javaee.amr.rabbitmq.config.RabbitMQConfig;
import com.javaee.amr.rabbitmq.domain.Message;

@Service
public class MessageServiceImpl implements MessageService {

	private final RabbitTemplate rabbitTemplate;

	public MessageServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
	}
	
	@Override
	public void sendMessage(Message message) {
        this.rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_MESSAGES, message);
	}
	
}
