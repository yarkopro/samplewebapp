package com.yarkopro.samplewebapp.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    Page<Employee> getForPage(Pageable pageable) {
        return employeeService.getAllForPage(pageable);
    }

    @GetMapping("/search")
    List<Employee> searchByName(@RequestParam("name") String name) {
        return employeeService.search(name);
    }

    @PatchMapping
    Employee update(Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping
    void delete(Employee employee) {
        employeeService.delete(employee);
    }

}
