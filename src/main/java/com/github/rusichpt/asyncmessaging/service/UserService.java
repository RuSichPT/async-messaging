package com.github.rusichpt.asyncmessaging.service;

import com.github.rusichpt.asyncmessaging.dto.User;

public interface UserService {
    void sendUser(User user);
}
