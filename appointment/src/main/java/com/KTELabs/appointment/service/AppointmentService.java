package com.KTELabs.appointment.service;

import com.KTELabs.appointment.Ticket;

import com.KTELabs.appointment.storage.AppointmentStorage;
import com.KTELabs.hospital.model.Client;
import com.KTELabs.hospital.storages.ClientStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    AppointmentStorage appointmentStorage;
    @Autowired
    ClientStorage clientStorage;
    public ResponseEntity<Object> createAppointment(Integer ticketId,Integer clientId) {
        Client client=clientStorage.getClient(clientId);
        Ticket ticket = appointmentStorage.getTicket(ticketId);
        ticket.setClient(client);
        return new ResponseEntity<>((appointmentStorage.createAppointment(ticket)), HttpStatus.CREATED);
    }
}
