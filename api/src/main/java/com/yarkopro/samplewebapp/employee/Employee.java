package com.yarkopro.samplewebapp.employee;

import com.yarkopro.samplewebapp.department.Department;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "tblEmployees")
public class Employee {
    @Id
    @Column(name = "empID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "empName")
    String name;
    @Column(name = "empActive")
    boolean isActive;
    @JoinColumn(name = "emp_dpID")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    Department department;
}
