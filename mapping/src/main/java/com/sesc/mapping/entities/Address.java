package com.sesc.mapping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    private int houseNumber;
    private String streetName;
    private String postCode;
    private String countryName;


    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
