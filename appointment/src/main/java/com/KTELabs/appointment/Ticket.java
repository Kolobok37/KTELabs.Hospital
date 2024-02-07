package com.KTELabs.appointment;

import com.KTELabs.hospital.model.Client;
import com.KTELabs.hospital.model.Doctor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Ticket {
    private int id;
    private LocalDateTime start;
    private Doctor doctor;
    private Client client;
}
