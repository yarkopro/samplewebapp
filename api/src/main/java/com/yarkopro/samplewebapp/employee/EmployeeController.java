package com.yarkopro.samplewebapp.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    Page<Employee> getForPage(Pageable pageable) {
        return employeeService.getAllForPage(pageable);
    }

    @GetMapping("/{id}")
    ResponseEntity<Employee> getById(@PathVariable Integer id) {
        Optional<Employee> employee = employeeService.getById(id);
        if (employee.isPresent())
            return ResponseEntity.ok(employee.get());
        else
            return ResponseEntity.notFound().build();
    }

    @GetMapping("/search")
    List<Employee> searchByName(@RequestParam("name") String name) {
        return employeeService.search(name);
    }

    @PatchMapping
    Employee update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping("/{employeeId}")
    ResponseEntity delete(@PathVariable int employeeId) {
        if (employeeService.delete(employeeId))
            return ResponseEntity.noContent().build();
        else
            return ResponseEntity.notFound().build();
    }

}
