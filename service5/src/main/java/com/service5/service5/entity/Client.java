package com.service5.service5.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Table(name = "client")
@Entity
@Data
public class Client {

    @Id
    private Long id;
    private String fullName;
    private String address;
    private String cardNumber;
}
