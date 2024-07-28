package com.service2.service2.service;

import com.service2.service2.dto.ClientDto;
import com.service2.service2.dto.ClientRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class MessageConsumer {

    private final NameService nameService;
    private final MessageSender messageSender;

    @RabbitListener(queues = {"${rabbitmq.request.queue.name}"}, exclusive = true)
    public void consumeMessage(ClientRequestDto receivedClient) {
        log.info("Service 2: message consumed: {}", receivedClient);
        ClientDto clientDto = new ClientDto();
        clientDto.setId(receivedClient.getId());
        clientDto.setFullName(nameService.getClientName());
        messageSender.sendMessage(clientDto);
    }
}
