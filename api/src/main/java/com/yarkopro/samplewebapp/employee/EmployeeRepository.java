package com.yarkopro.samplewebapp.employee;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    @Query("select employee from Employee employee where employee.name like ?1%")
    List<Employee> findByName(String name);
}
