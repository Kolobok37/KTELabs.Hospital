package com.KTELabs.hospital.storages;

import com.KTELabs.hospital.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
