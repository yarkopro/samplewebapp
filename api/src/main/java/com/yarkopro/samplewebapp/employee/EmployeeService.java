package com.yarkopro.samplewebapp.employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

interface EmployeeService {
    Page<Employee> getAllForPage(Pageable pageable);
    Employee update(Employee employee);
    List<Employee> search(String name);
    boolean delete(int employeeId);
    Optional<Employee> getById(Integer id);
}
