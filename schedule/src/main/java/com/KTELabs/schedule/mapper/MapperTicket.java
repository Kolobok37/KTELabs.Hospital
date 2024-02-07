package com.KTELabs.schedule.mapper;

import com.KTELabs.schedule.storage.TicketStorageDto;
import schedule1.localhost._8080.Ticket;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.ZoneId;
import java.util.GregorianCalendar;

public class MapperTicket {
    public static Ticket mapToTicket(TicketStorageDto ticketStorageDto) {
        XMLGregorianCalendar start=null;
        XMLGregorianCalendar end=null;
        try {
            start = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(GregorianCalendar.from(ticketStorageDto.getStartTime()
                            .atZone(ZoneId.systemDefault())));
            end = DatatypeFactory.newInstance()
                    .newXMLGregorianCalendar(GregorianCalendar.from(ticketStorageDto.getEndTime()
                            .atZone(ZoneId.systemDefault())));
        }
        catch (DatatypeConfigurationException e){

        }
        return new Ticket(ticketStorageDto.getId(),start,end
                ,ticketStorageDto.getDoctor());
    }
}
