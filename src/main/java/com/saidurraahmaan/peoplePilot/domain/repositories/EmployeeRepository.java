package com.saidurraahmaan.peoplePilot.domain.repositories;

import com.saidurraahmaan.peoplePilot.domain.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
