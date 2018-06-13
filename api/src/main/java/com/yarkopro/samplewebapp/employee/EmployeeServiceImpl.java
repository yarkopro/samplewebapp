package com.yarkopro.samplewebapp.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

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

    @Override
    public List<Employee> search(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public Optional<Employee> getById(Integer id) {
        return employeeRepository.findById(id);
    }

    @Override
    public boolean delete(int employeeId) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()){
            employeeRepository.delete(employee.get());
            return true;
        } else return false;
    }
}
