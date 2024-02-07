package com.KTELabs.hospital.dto;

import com.KTELabs.hospital.model.Doctor;

public class MapperDoctor {
    public static Doctor mapToDoctorDto(DoctorDto doctorDto) {
        return new Doctor(null, null, doctorDto.getFullName(), doctorDto.getSpecializations());
    }

    public static DoctorDto mapToDoctorDto(Doctor doctor) {
        return new DoctorDto(doctor.getId(), doctor.getFullName(), doctor.getSpecializations());
    }
}
