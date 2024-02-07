package com.KTELabs.hospital.services;

import com.KTELabs.hospital.storages.ClientStorage;
import com.KTELabs.hospital.dto.ClientDto;
import com.KTELabs.hospital.dto.MapperClient;
import com.KTELabs.hospital.model.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientServices {
    ClientStorage clientStorage;
    public ResponseEntity<Object> createClient(ClientDto clientDto) {
        Client client = MapperClient.mapToClient(clientDto);
        return new ResponseEntity<>(MapperClient.mapToClientDto(clientStorage.createClient(client)), HttpStatus.CREATED);
        }

    public ResponseEntity<Object> getClient(Integer id) {
        return new ResponseEntity<>(MapperClient.mapToClientDto(clientStorage.getClient(id)), HttpStatus.OK);
    }
}

