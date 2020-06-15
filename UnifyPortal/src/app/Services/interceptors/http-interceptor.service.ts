/*
import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpRequest, HttpHandler, HttpEvent } from '@angular/common/http';
import { LoginServiceService } from '../Login/login-service.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HttpInterceptorService implements HttpInterceptor {

  constructor(
    private loginService: LoginServiceService
  ) { }

  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {

    let basicAuthenticationString = this.loginService.getAuthenticatedToken()
    let username = this.loginService.getAuthenticatedUser()
    
    if (basicAuthenticationString && username) {
      console.log('authenticatd token : interceptor log');
      console.log(this.loginService.getAuthenticatedToken());

      request = request.clone({
        setHeaders: { Authorization: this.loginService.getAuthenticatedToken() }
      });
    }

    return next.handle(request)
  }

}
*/




