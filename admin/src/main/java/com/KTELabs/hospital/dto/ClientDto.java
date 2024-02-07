package com.KTELabs.hospital.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ClientDto {
    private Integer id;
    @NotNull
    private String fullName;
    @NotNull
    private LocalDateTime birthDate;
}
