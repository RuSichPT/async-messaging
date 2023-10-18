package com.github.rusichpt.asyncmessaging.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String surname;
    private int age;
}
