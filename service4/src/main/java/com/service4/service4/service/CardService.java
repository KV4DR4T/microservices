package com.service4.service4.service;

import org.springframework.stereotype.Service;

@Service
public class CardService {

    private final String card = "1234 4231 3123 4324";

    public String getCardNumber() {
        return card;
    }
}
