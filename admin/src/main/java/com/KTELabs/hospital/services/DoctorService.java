package com.KTELabs.hospital.services;

import com.KTELabs.hospital.storages.DoctorStorage;
import com.KTELabs.hospital.dto.DoctorDto;
import com.KTELabs.hospital.dto.MapperDoctor;
import com.KTELabs.hospital.model.Doctor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    DoctorStorage doctorStorage;
    public ResponseEntity<Object> createDoctor(DoctorDto doctorDto) {
        Doctor doctor = MapperDoctor.mapToDoctorDto(doctorDto);
        return new ResponseEntity<>(MapperDoctor.mapToDoctorDto(doctorStorage.createDoctor(doctor)), HttpStatus.CREATED);
    }

    public ResponseEntity<Object> getDoctor(Integer id) {
        return new ResponseEntity<>(MapperDoctor.mapToDoctorDto(doctorStorage.getDoctor(id)), HttpStatus.OK);
    }
}
