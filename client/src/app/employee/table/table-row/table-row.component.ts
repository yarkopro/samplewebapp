import {Component, Input, OnInit} from '@angular/core';
import {EmployeeService} from '../../employee.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-table-row',
  templateUrl: './table-row.component.html',
  styleUrls: ['./table-row.component.css']
})
export class TableRowComponent implements OnInit {

  @Input("employee")
  employee;

  constructor(private employeeService: EmployeeService,
              private router: Router) { }

  ngOnInit() {
  }

  edit() {
    this.router.navigate(["/employee-edit/", this.employee.id])
  }

  delete() {
    this.employeeService.deleteEmployee(this.employee.id)
      .subscribe(() => this.employee = null)
  }

}
