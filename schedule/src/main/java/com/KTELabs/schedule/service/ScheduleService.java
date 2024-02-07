package com.KTELabs.schedule.service;

import com.KTELabs.schedule.mapper.MapperTicket;
import org.springframework.stereotype.Service;
import com.KTELabs.schedule.storage.TicketStorage;
import com.KTELabs.schedule.storage.TicketStorageDto;
import schedule1.localhost._8080.GetScheduleRequest;
import schedule1.localhost._8080.Ticket;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScheduleService {
    TicketStorage ticketStorage;
    public List<Ticket> createSchedule(GetScheduleRequest request) {
        List<TicketStorageDto> tickets=new ArrayList<>();
        LocalDateTime start = request.getDate().toGregorianCalendar().toZonedDateTime().toLocalDateTime();
        for(int i=0;i==request.getCount();i++){
            TicketStorageDto ticket = new TicketStorageDto(null,start,
                    request.getDoctor(),null);
            tickets.add(ticket);
            start=start.plusMinutes(request.getDuration());
        }
        return ticketStorage.createSchedule(tickets).stream().map(MapperTicket::mapToTicket).collect(Collectors.toList());
    }
}
