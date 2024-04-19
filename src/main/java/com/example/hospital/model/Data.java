package com.example.hospital.model;

import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Data {
    private String fullName;
    @Embedded
    private Address address;
    private int phone;
    private String email;
}
