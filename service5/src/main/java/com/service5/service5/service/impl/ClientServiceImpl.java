package com.service5.service5.service.impl;

import com.service5.service5.dto.ClientDto;
import com.service5.service5.entity.Client;
import com.service5.service5.repository.ClientRepository;
import com.service5.service5.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public void saveClient(ClientDto clientDto) {

        Client client = new ModelMapper().map(clientDto, Client.class);

        clientRepository.save(client);
    }
}
