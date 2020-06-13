import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from '../login/login.component';
import { HomeComponent } from '../home/home.component';
import { ErrorComponent } from '../error/error.component';
import { MegaMenuComponent } from '../megaMenu/mega-menu.component';
import {RouteGuardServiceService} from '../../services/RouteGuard/route-guard-service.service'
import { AuthorizationSimpleSearchComponent } from '../authorization-simple-search/authorization-simple-search.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'login', component: LoginComponent },
  { path: 'home', component: HomeComponent ,canActivate : [RouteGuardServiceService] },
  {path: 'menu' , component:MegaMenuComponent},
  {path: 'authorizationsimplesearch' , component:AuthorizationSimpleSearchComponent},
  


  { path: '**', component: ErrorComponent },
];


@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash : true} ) ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
