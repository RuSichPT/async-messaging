package com.github.rusichpt.asyncmessaging.service.impl;

import com.github.rusichpt.asyncmessaging.dto.User;
import com.github.rusichpt.asyncmessaging.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Profile("kafka")
public class KafkaUserService implements UserService {
    private final KafkaTemplate<String, User> kafkaTemplate;

    @Override
    public void sendUser(User user) {
        kafkaTemplate.sendDefault(user);
    }
}
