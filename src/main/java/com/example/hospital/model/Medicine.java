package com.example.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    private String name;

    public Medicine(String code, String name) {
        setCode(code);
        setName(name);
    }
}
