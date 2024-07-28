package com.service2.service2.service;

import org.springframework.stereotype.Service;

@Service
public class NameService {

    private final String fullName = "John Doe";

    public String getClientName() {
        return fullName;
    }
}
