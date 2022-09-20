package com.producer.first.producer.service;

import com.producer.first.producer.dto.Message;

public interface AmqpService {
	void sendToConsumer(Message message);
}
