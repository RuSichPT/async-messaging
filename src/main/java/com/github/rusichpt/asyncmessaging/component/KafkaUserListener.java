package com.github.rusichpt.asyncmessaging.component;

import com.github.rusichpt.asyncmessaging.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Profile("kafka")
public class KafkaUserListener {
    @KafkaListener(topics = {"test.messaging.topic"}, groupId = "test")
    public void receiveUser(User user) {
        log.info("Receive user {}", user);
    }
}
