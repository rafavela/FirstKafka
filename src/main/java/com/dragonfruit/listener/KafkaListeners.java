package com.dragonfruit.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

	@KafkaListener(topics="dragonfruit",groupId="cats")
	void listener(String data) {
		System.out.println("listener received "+ data + " tada");
	}
}
