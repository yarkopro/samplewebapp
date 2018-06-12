package com.yarkopro.samplewebapp.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    Page<Employee> getEmployeesPage(Pageable pageable) {
        return employeeService.getAllForPage(pageable);
    }
    @PatchMapping
    Employee updateEmployee(Employee employee) {
        return employeeService.update(employee);
    }
}
