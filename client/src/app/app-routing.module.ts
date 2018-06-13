import {RouterModule, Routes} from '@angular/router';
import {NgModule} from '@angular/core';
import {EditEmployeeComponent} from './employee/edit-employee/edit-employee.component';

const routes: Routes = [
  {path: 'employee-edit/:id', component: EditEmployeeComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
