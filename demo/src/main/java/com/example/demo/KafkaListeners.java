package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

	@KafkaListener(
			topics= "demo",
			groupId ="groupId")
	void Listener(String data) {
	System.out.println("Message recieved: " + data);	
	}
}
