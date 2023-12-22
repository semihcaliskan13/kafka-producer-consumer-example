package com.example.kafkaproducerconsumer.listener;

import com.example.kafkaproducerconsumer.dto.KafkaMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "ll-topic", groupId = "group-id", properties = {"spring.json.value.default.type=com.example.kafkaproducerconsumer.dto.KafkaMessage"})
    private void consume(@Payload KafkaMessage message){
        System.out.println(message);
    }


}
