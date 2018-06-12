package com.yarkopro.samplewebapp.Employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

interface EmployeeService {
    Page<Employee> getAllForPage(Pageable pageable);
    Employee update(Employee employee);
}
