package com.yarkopro.samplewebapp.Department;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tblDepartments")
public class Department {
    @Column(name = "dpID")
    int id;
    @Column(name = "dpName")
    String name;
}
