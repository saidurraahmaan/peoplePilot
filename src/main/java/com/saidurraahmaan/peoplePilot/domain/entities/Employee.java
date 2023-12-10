package com.saidurraahmaan.peoplePilot.domain.entities;

import com.saidurraahmaan.peoplePilot.enums.Department;
import com.saidurraahmaan.peoplePilot.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "employee_name", nullable = false)
    private String name;

    @Column(name = "employee_salary", nullable = false)
    private Double salary;


    @NotNull
    @Column(name = "department", nullable = false)
    @Enumerated(EnumType.STRING)
    private Department department;


    @NotNull
    @Column(name = "role",nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;


    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Attendance> attendanceList;
}
