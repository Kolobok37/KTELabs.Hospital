package com.KTELabs.hospital.controllers;

import com.KTELabs.hospital.dto.ClientDto;
import com.KTELabs.hospital.services.ClientServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("clients")
public class ClientController {
    @Autowired
    ClientServices clientServices;

    @PostMapping()
    public ResponseEntity<Object> createClient(@RequestBody @Valid ClientDto clientDto) {
        return clientServices.createClient(clientDto);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Object> getClient(@PathVariable @Positive Integer id) {
        return clientServices.getClient(id);
    }
}
