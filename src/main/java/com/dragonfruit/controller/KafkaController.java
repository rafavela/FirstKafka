package com.dragonfruit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragonfruit.bean.KafkaBean;

@RestController
@RequestMapping("/v1/kafka")
public class KafkaController {

	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@PostMapping("/messages")
	public void post(@RequestBody KafkaBean kafkaBean) {
		kafkaTemplate.send("dragonfruit",kafkaBean.getMessage());
	}
	
	
}
