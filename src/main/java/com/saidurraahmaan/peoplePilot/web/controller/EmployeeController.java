package com.saidurraahmaan.peoplePilot.web.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.saidurraahmaan.peoplePilot.domain.dtos.EmployeeDTO;
import com.saidurraahmaan.peoplePilot.domain.services.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public ResponseEntity<Boolean> addEmployee(@RequestBody EmployeeDTO employee) {
        var isAdded = employeeService.addEmployee(employee);

        if (isAdded) {
            return ResponseEntity.ok(true);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false);
        }
    }
}
