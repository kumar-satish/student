package com.sesc.mapping.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String studentCourse;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Address address;
}
