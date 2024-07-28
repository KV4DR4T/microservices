package com.service1.service1.service;

import com.service1.service1.dto.ClientRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class MessageSender {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    private final RabbitTemplate template;

    public void sendMessage(ClientRequestDto clientRequestDto) {
        template.convertAndSend(exchange, routingKey, clientRequestDto);
        log.info("Service 1: message sent: {}", clientRequestDto);
    }
}
