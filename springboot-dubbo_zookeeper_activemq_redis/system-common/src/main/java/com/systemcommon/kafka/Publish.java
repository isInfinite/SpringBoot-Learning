package com.systemcommon.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Publish {
	@Autowired
    private KafkaTemplate kafkaTemplate;
	
	public void publish(String topic,String message){
        kafkaTemplate.send(topic,message);
    }
}
