package com.example.hospital.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Prescription {
    //@ManyToMany
    private Medicine medicine;
    private double dose;
}