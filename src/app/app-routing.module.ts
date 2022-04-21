import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { AchieveComponent } from './achieve/achieve.component';
import { HomeComponent } from './home/home.component';


const routes: Routes = [{path: 'employees', component: EmployeeListComponent},
{path: 'create-employee', component: CreateEmployeeComponent},
{path: '', redirectTo: 'home', pathMatch: 'full'},
{path: 'update-employee/:id', component: UpdateEmployeeComponent},
{path: 'employee-details/:id', component: EmployeeDetailsComponent},
{path: 'about', component: AboutComponent},
{path: 'contact', component: ContactComponent},
{path: 'achieve', component: AchieveComponent},
{path: 'home', component: HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
