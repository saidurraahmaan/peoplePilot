package com.saidurraahmaan.peoplePilot.domain.dtos;

import com.saidurraahmaan.peoplePilot.domain.entities.Attendance;
import com.saidurraahmaan.peoplePilot.domain.entities.Employee;
import com.saidurraahmaan.peoplePilot.enums.Department;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
public class EmployeeDTO {

    private int id;
    private String name;
    private Double salary;
    private Department department;
    private List<Attendance> attendanceList;

    static EmployeeDTO fromEntity(Employee employee) {
        var employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employeeDTO.getId());
        employeeDTO.setName(employee.getName());
        employeeDTO.setSalary(employee.getSalary());
        employeeDTO.setDepartment(employee.getDepartment());
        employeeDTO.setAttendanceList(employee.getAttendanceList());
        return employeeDTO;
    }
}
