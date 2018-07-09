package com.javaee.amr.rabbitmq.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
	
	private static final long serialVersinoUID = 1L;
	
	private String subject; 
	private String body; 

}
