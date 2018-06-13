import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';
import {Employee} from './employee';

@Injectable()
export class EmployeeService {

  constructor(private http: HttpClient) { }
  private readonly BASE_URL = "/api/employee";

  searchEmployee(name: string): Observable<Employee[]> {
    return this.http.get<Employee[]>(`${this.BASE_URL}/search?name=${name}`)
  }

  getEmployeePage(pageNumber, pageSize): Observable<any> {
    return this.http.get<any>(`${this.BASE_URL}?page=${pageNumber}&size=${pageSize}`)
  }

  updateEmployee(employee: Employee): Observable<any> {
    return this.http.patch(this.BASE_URL, employee, {responseType: "text"})
  }

  deleteEmployee(employeeId: number): Observable<any> {
    return this.http.delete(this.BASE_URL + '/' + employeeId, {responseType: 'text'});
  }
}
