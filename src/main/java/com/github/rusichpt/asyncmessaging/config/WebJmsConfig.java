package com.github.rusichpt.asyncmessaging.config;

import com.github.rusichpt.asyncmessaging.dto.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;

import java.util.HashMap;
import java.util.Map;


@Configuration
@Profile("artemis")
public class WebJmsConfig {
    @Bean
    MessageConverter messageConverter() {
        MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
        messageConverter.setTypeIdPropertyName("_typeId");
        Map<String, Class<?>> typeIdMappings = new HashMap<>();
        typeIdMappings.put("user", User.class);
        messageConverter.setTypeIdMappings(typeIdMappings);

        return messageConverter;
    }
}
