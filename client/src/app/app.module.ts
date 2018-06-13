import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { SearchComponent } from './employee/search/search.component';
import { TableComponent } from './employee/table/table.component';
import { TableRowComponent } from './employee/table/table-row/table-row.component';


@NgModule({
  declarations: [
    AppComponent,
    SearchComponent,
    TableComponent,
    TableRowComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
