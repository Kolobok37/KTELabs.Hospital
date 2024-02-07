package com.KTELabs.hospital.dto;

import com.KTELabs.hospital.model.Specialization;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@AllArgsConstructor
@Data
public class DoctorDto {
    private Integer id;
    @NotBlank
    private String fullName;
    @NotBlank
    private List<Specialization> specializations;
}
