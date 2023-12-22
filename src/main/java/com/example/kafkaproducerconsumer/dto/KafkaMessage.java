package com.example.kafkaproducerconsumer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(of = {"id", "message", "messageDate"})
public class KafkaMessage {
    private String id = UUID.randomUUID().toString();
    private String message;
    private LocalDateTime messageDate = LocalDateTime.now();

}
