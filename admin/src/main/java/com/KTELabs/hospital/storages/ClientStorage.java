package com.KTELabs.hospital.storages;

import com.KTELabs.hospital.exception.NotFoundException;
import com.KTELabs.hospital.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientStorage {
    @Autowired
    ClientRepository clientRepository;
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public Client getClient(Integer id) {
        return clientRepository.findById(id).orElseThrow(() -> new NotFoundException("Client is not found"));
    }
}
