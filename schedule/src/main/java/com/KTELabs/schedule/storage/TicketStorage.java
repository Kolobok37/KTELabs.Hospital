package com.KTELabs.schedule.storage;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketStorage{
    TicketRepository ticketRepository;

    public List<TicketStorageDto> createSchedule(List<TicketStorageDto> tickets) {
        return ticketRepository.saveAll(tickets);
    }

}
