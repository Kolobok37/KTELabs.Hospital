package com.KTELabs.schedule.storage;


import ch.qos.logback.core.net.server.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import schedule1.localhost._8080.Doctor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class TicketStorageDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "start_time")
    private  LocalDateTime startTime;
    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

}
