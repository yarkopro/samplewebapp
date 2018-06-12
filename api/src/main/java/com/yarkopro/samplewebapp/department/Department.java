package com.yarkopro.samplewebapp.department;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tblDepartments")
public class Department {
    @Id
    @Column(name = "dpID")
    int id;
    @Column(name = "dpName")
    String name;
}
