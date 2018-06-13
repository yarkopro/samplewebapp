import { Component, OnInit } from '@angular/core';
import {EmployeeService} from '../employee.service';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {


  pageNumber: number = 1;
  totalSize: number;
  itemsPerPage: number = 4;
  employeePage: any;

  constructor(private employeeService: EmployeeService) { }

  ngOnInit() {
    this.pageChange(this.pageNumber)
  }

  pageChange(number) {
    this.employeeService.getEmployeePage(this.pageNumber - 1, this.itemsPerPage)
      .subscribe((page) => this.employeePage = page)
  }

}
