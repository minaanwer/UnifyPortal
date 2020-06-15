import { Injectable } from '@angular/core';
import { CanActivate, Router, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { LoginServiceService } from '../Login/login-service.service';

@Injectable({
  providedIn: 'root'
})
export class RouteGuardServiceService implements CanActivate {

  constructor(private router: Router, private loginService: LoginServiceService) { }


  canActivate(router: ActivatedRouteSnapshot, state: RouterStateSnapshot) {

    if (this.loginService.IsUserLogin()) {
      return true;
    }
    this.router.navigate(['login']);
    return false;
  }



}
