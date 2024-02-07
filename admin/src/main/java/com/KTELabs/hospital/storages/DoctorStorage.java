package com.KTELabs.hospital.storages;

import com.KTELabs.hospital.exception.NotFoundException;
import com.KTELabs.hospital.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorStorage {
    @Autowired
    DoctorRepository doctorRepository;
    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Doctor getDoctor(Integer id) {
        return doctorRepository.findById(id).orElseThrow(() -> new NotFoundException("Doctor is not found"));
    }
}
