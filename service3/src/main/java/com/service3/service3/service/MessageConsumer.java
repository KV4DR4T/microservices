package com.service3.service3.service;

import com.service3.service3.dto.ClientDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class MessageConsumer {

    private final AddressService addressService;
    private final MessageSender messageSender;

    @RabbitListener(queues = {"${rabbitmq.request.queue.name}"}, exclusive = true)
    public void consumeMessage(ClientDto receivedClient) {
        log.info("Service 3: message consumed: {}", receivedClient);
        receivedClient.setAddress(addressService.getAddress());
        messageSender.sendMessage(receivedClient);
    }
}
