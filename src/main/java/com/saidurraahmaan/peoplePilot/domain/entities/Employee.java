package com.saidurraahmaan.peoplePilot.domain.entities;

import com.saidurraahmaan.peoplePilot.enums.Department;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="employee_name" ,nullable = false)
    private String name;

    @Column(name = "employee_salary",nullable = false)
    private Double salary;


    @Column(name = "department",nullable = false)
    @Enumerated(EnumType.STRING)
    private Department department;
}
