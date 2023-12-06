package com.saidurraahmaan.peoplePilot.domain.services.impl;

import com.saidurraahmaan.peoplePilot.domain.dtos.EmployeeDTO;
import com.saidurraahmaan.peoplePilot.domain.entities.Employee;
import com.saidurraahmaan.peoplePilot.domain.repositories.EmployeeRepository;
import com.saidurraahmaan.peoplePilot.domain.services.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Boolean addEmployee(EmployeeDTO employee) {
        var employeeEntity = new Employee();
        employeeEntity.setName(employee.getName());
        employeeEntity.setSalary(employee.getSalary());
        employeeEntity.setDepartment(employee.getDepartment());
        employeeRepository.save(employeeEntity);

        return true;
    }
}
