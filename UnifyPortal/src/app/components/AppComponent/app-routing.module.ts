import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from '../login/login.component';
import { HomeComponent } from '../home/home.component';
import { ErrorComponent } from '../error/error.component';
import { MegaMenuComponent } from '../megaMenu/mega-menu.component';
import {RouteGuardServiceService} from '../../services/DataServices/HelpfulServices/route-guard-service.service'

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'login', component: LoginComponent },
  { path: 'home', component: HomeComponent ,canActivate : [RouteGuardServiceService] },
  {path: 'menu' , component:MegaMenuComponent},


  { path: '**', component: ErrorComponent },
];


@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash : true} ) ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
