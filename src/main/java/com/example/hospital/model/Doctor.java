package com.example.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Doctor extends Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Specialty specialty;


    public Doctor(String fullName, Address address, int phone, String email, Specialty specialty) {
        super(fullName, address, phone, email);
        setSpecialty(specialty);
    }
}
