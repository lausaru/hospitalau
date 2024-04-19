package com.example.hospital.model;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Diagnosis {
    private Specialty specialty;
    private String disease;
    @OneToMany
    private List<Prescription> prescriptions;
    private Doctor doctor;
}
