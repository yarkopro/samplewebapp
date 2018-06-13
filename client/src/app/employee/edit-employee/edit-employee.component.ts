import {Component, Input, OnInit} from '@angular/core';
import {Employee} from '../employee';
import {Department} from '../../department/department';
import {DepartmentsService} from '../../department/departments.service';
import {EmployeeService} from '../employee.service';
import {ActivatedRoute} from '@angular/router';
import 'rxjs/add/operator/switchMap';

@Component({
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html',
  styleUrls: ['./edit-employee.component.css']
})
export class EditEmployeeComponent implements OnInit {

  employee: Employee;
  departments: Department[];

  constructor(private depService: DepartmentsService,
              private route: ActivatedRoute,
              private empService: EmployeeService) { }

  ngOnInit() {
    this.route.params.switchMap((params) => this.empService.getById(params["id"]))
      .subscribe(employee => this.employee = employee);
    this.depService.getDepartments()
      .subscribe((departments) => this.departments = departments)
  }

  save() {
    console.log(this.employee)
    this.empService.updateEmployee(this.employee)
      // .subscribe()
  }

  cancel() {
    this.employee = null;
  }

  updateDepartment(departmentName) {
    this.employee.department = this.departments.find(dep => dep.name == departmentName);
  }
}
