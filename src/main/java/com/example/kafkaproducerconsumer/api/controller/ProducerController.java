package com.example.kafkaproducerconsumer.api.controller;

import com.example.kafkaproducerconsumer.dto.KafkaMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/kafka")
public class ProducerController {



    private final KafkaTemplate<String, KafkaMessage> kafkaTemplate;

    public ProducerController(KafkaTemplate<String, KafkaMessage> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void sendKafkaMessage(@RequestBody KafkaMessage kafkaMessage){
        kafkaTemplate.send("ll-topic", UUID.randomUUID().toString(),kafkaMessage);
    }
}
