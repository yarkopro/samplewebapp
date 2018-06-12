package com.yarkopro.samplewebapp.Employee;

import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    List<Employee> findByName(String name);
}
