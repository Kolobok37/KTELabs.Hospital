package com.KTELabs.appointment.storage;

import com.KTELabs.appointment.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Ticket,Integer> {
}
