package com.example.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.awt.geom.GeneralPath;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    private String name;
}
