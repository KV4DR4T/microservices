package com.service4.service4.service;

import com.service4.service4.dto.ClientDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class MessageConsumer {

    private final CardService cardService;
    private final MessageSender messageSender;

    @RabbitListener(queues = {"${rabbitmq.request.queue.name}"}, exclusive = true)
    public void consumeMessage(ClientDto receivedClient) {
        log.info("Service 4: message consumed: {}", receivedClient);
        receivedClient.setCardNumber(cardService.getCardNumber());
        messageSender.sendMessage(receivedClient);
    }
}
