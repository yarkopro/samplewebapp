package com.yarkopro.samplewebapp.employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

interface EmployeeService {
    Page<Employee> getAllForPage(Pageable pageable);
    Employee update(Employee employee);
    List<Employee> search(String name);
    void delete(Employee employee);
}
