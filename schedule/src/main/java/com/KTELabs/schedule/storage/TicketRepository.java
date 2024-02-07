package com.KTELabs.schedule.storage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketStorageDto,Integer> {
}
