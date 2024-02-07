package com.KTELabs.hospital.dto;

import com.KTELabs.hospital.model.Client;

public class MapperClient {
    public  static Client mapToClient(ClientDto clientDto){
        return new Client(null,null,clientDto.getFullName(),clientDto.getBirthDate());
    }
    public  static ClientDto mapToClientDto(Client client){
        return new ClientDto(client.getId(),client.getFullName(),client.getBirthDate());
    }
}
