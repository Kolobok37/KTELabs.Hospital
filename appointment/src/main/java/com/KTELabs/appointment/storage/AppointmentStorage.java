package com.KTELabs.appointment.storage;

import com.KTELabs.appointment.Ticket;
import com.KTELabs.hospital.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppointmentStorage {
    @Autowired
    AppointmentRepository appointmentRepository;
    public Ticket getTicket(Integer ticketId) {
        return appointmentRepository.findById(ticketId).orElseThrow(() -> new NotFoundException("Ticket is not found"));
    }

    public Ticket createAppointment(Ticket ticket) {
        return appointmentRepository.save(ticket);

    }
}
