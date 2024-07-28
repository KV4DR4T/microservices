package com.service3.service3.dto;

import lombok.Data;

import java.util.List;


@Data
public class ClientDto {

    private Long id;
    private String fullName;
    private String address;
    private List<String> cardNumbers;
}
