package com.service5.service5.service;

import com.service5.service5.dto.ClientDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class MessageConsumer {

    private final ClientService clientService;

    @RabbitListener(queues = {"${rabbitmq.request.queue.name}"}, exclusive = true)
    public void consumeMessage(ClientDto receivedClient) {
        log.info("Service 5: message consumed: {}", receivedClient);
        if(receivedClient.getFullName()!=null) {
            clientService.saveClient(receivedClient);
        }
    }
}
