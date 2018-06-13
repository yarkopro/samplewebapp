import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { SearchComponent } from './employee/search/search.component';
import { TableComponent } from './employee/table/table.component';
import { TableRowComponent } from './employee/table/table-row/table-row.component';
import { EditEmployeeComponent } from './employee/edit-employee/edit-employee.component';
import {NgxPaginationModule} from 'ngx-pagination';
import {FormsModule} from '@angular/forms';
import {EmptyError} from 'rxjs/util/EmptyError';
import {EmployeeService} from './employee/employee.service';
import {Department} from './department/department';
import {DepartmentsService} from './department/departments.service';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import {RouterModule} from '@angular/router';
import {AppRoutingModule} from './app-routing.module';


@NgModule({
  declarations: [
    AppComponent,
    SearchComponent,
    TableComponent,
    TableRowComponent,
    EditEmployeeComponent
  ],
  imports: [
    BrowserModule,
    NgxPaginationModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [EmployeeService, DepartmentsService, HttpClient ],
  bootstrap: [AppComponent]
})
export class AppModule { }
