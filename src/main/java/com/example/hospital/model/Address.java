package com.example.hospital.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Address {
    private String streetAddress;
    private String city;
    private int postalCode;
}
