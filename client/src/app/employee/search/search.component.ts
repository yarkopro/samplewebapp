import { Component, OnInit } from '@angular/core';
import {EmployeeService} from '../employee.service';
import {Employee} from '../employee';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  name: string = "";
  employees: Employee[];

  constructor(private employeeService: EmployeeService) { }

  ngOnInit() {

  }

  search() {
    this.employeeService.searchEmployee(this.name)
      .subscribe((employees) => this.employees = employees)
  }
}
