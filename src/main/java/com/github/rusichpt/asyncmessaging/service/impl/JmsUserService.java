package com.github.rusichpt.asyncmessaging.service.impl;

import com.github.rusichpt.asyncmessaging.dto.User;
import com.github.rusichpt.asyncmessaging.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JmsUserService implements UserService {
    private final JmsTemplate jms;

    @Override
    public void sendUser(User user) {
        jms.convertAndSend(user);
    }
}
