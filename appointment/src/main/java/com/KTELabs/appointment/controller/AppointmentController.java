package com.KTELabs.appointment.controller;

import com.KTELabs.appointment.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@Validated
@RestController
@RequestMapping("appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @PostMapping()
    public ResponseEntity<Object> createAppointments(@PathVariable Integer ticketId,@PathVariable Integer clientId) {
        return appointmentService.createAppointment(ticketId,clientId);
    }
}
