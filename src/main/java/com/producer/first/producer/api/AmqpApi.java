package com.producer.first.producer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.producer.first.producer.dto.Message;
import com.producer.first.producer.service.AmqpService;

@RestController
public class AmqpApi {

	@Autowired
	private AmqpService service;
	
	@ResponseStatus(HttpStatus.ACCEPTED)
	@PostMapping("/send")
	public void sendToConsumer(@RequestBody Message message) {
		service.sendToConsumer(message);
	}
}
