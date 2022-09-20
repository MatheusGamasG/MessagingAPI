package com.producer.first.producer.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.producer.first.producer.amqp.AmqpProducer;
import com.producer.first.producer.dto.Message;
import com.producer.first.producer.service.AmqpService;

@Service
public class RabbitMQService implements AmqpService {

	@Autowired
	private AmqpProducer<Message> amqp;
	
	@Override
	public void sendToConsumer(Message message) {
		amqp.producer(message);		
	}

}
