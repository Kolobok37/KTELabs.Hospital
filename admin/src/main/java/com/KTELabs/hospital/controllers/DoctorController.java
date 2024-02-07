package com.KTELabs.hospital.controllers;

import com.KTELabs.hospital.dto.DoctorDto;
import com.KTELabs.hospital.services.DoctorService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@Controller
@RequiredArgsConstructor
@Validated
@RestController
@RequestMapping("doctor")
public class DoctorController {
    DoctorService clientStorage;
    @PostMapping()
    public ResponseEntity<Object> createDoctor(@RequestBody @Valid DoctorDto doctorDto) {
        return clientStorage.createDoctor(doctorDto);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Object> getDoctor(@PathVariable @Positive Integer id) {
        return clientStorage.getDoctor(id);
    }
}
