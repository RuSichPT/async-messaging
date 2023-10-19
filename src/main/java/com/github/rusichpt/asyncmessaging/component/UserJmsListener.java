package com.github.rusichpt.asyncmessaging.component;

import com.github.rusichpt.asyncmessaging.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Profile("artemis")
public class UserJmsListener {

    @JmsListener(destination = "test.messaging.queue")
    public void receiveUser(User user) {
        log.info("Receive user {}", user);
    }
}
