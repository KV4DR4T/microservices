package com.service1.service1.controller;

import com.service1.service1.dto.ClientRequestDto;
import com.service1.service1.service.MessageSender;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final MessageSender messageSender;

    @PostMapping
    public ResponseEntity<Void> createClient(@RequestBody ClientRequestDto clientRequestDto, @RequestHeader("Sid") String sid) {
        if(sid == null || sid.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }else if(!sid.equals("123456")) {
            return ResponseEntity.status(403).build();
        }else {
            messageSender.sendMessage(clientRequestDto);
            return ResponseEntity.ok().build();
        }
    }
}
