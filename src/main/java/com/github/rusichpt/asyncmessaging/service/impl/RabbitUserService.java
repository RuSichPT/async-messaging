package com.github.rusichpt.asyncmessaging.service.impl;

import com.github.rusichpt.asyncmessaging.dto.User;
import com.github.rusichpt.asyncmessaging.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Profile("rabbit")
public class RabbitUserService implements UserService {
    private final RabbitTemplate rabbitTemplate;

    @Override
    public void sendUser(User user) {
        rabbitTemplate.convertAndSend(user);
    }
}
