package com.yarkopro.samplewebapp.Employee;

import com.yarkopro.samplewebapp.Department.Department;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "tblEmployees")
public class Employee {
    @Column(name = "empID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "empName")
    String name;
    @Column(name = "empActive")
    boolean isActive;
    @Column(name = "emp_dpID")
    Department department;

}
