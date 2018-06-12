package com.yarkopro.samplewebapp.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {\

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> getAllForPage(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }
}
