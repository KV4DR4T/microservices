package com.service3.service3.service;

import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private final String address = "123 Main St";

    public String getAddress() {
        return address;
    }
}
