import { Component } from '@angular/core';
import {EmployeeService} from './employee/employee.service';
import {DepartmentsService} from './department/departments.service';
import {Employee} from './employee/employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  employees: Employee[];


  constructor () {
    // this.employeeService.getEmployeePage()
  }
}
