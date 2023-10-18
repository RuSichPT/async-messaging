package com.github.rusichpt.asyncmessaging.controller;

import com.github.rusichpt.asyncmessaging.dto.User;
import com.github.rusichpt.asyncmessaging.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @GetMapping("/send")
    public User sendUser() {
        User user = new User("username", "123", "user@mail.ru",
                "Name", "Surname", 18);
        userService.sendUser(user);
        log.info("Send user {}", user);
        return user;
    }
}
