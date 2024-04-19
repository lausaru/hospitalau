package com.example.hospital.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Patient extends Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private BloodType bloodType;
    @OneToMany
    private List<Appointment> appointments;
}
