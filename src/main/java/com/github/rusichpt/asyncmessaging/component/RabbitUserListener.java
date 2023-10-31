package com.github.rusichpt.asyncmessaging.component;

import com.github.rusichpt.asyncmessaging.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Profile("rabbit")
public class RabbitUserListener {
    @RabbitListener(queues = {"my_queue"})
    public void receiveUser(User user) {
        log.info("Receive user {}", user);
    }
}
