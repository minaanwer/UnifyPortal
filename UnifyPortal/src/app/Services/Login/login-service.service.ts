import { Injectable } from '@angular/core';
import { loginUserModel } from 'src/app/components/login/login.component';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';


export const TOKEN = 'token';
export const AUTHENTICATED_USER = 'authenticatedUser';


@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  constructor(private http:HttpClient) { }

  IsUserLogin() {
    let user = sessionStorage.getItem('activeUser');
    if (user === 'monna') {
      return true
    } else {
      return false;
    }

  }


  ValidateLogin(user: loginUserModel) {
    if (user.username === "monna" && user.password === "monna") {
      sessionStorage.setItem('activeUser', user.username);
    }
  }

  Logout() {
    sessionStorage.removeItem(AUTHENTICATED_USER);
    sessionStorage.removeItem(TOKEN);
  }

  getAuthenticatedUser() {
    return sessionStorage.getItem(AUTHENTICATED_USER);
  }
  getAuthenticatedToken() {
    if (this.getAuthenticatedUser()) {
      console.log("Get token : ");
      console.log(sessionStorage.getItem(TOKEN));
      
      return sessionStorage.getItem(TOKEN);
    }
  }


  executeAuthorizationService(username: string, password: string) {

    console.log('username :   ' + username)
    console.log('password :   ' + password)
   
   
    return this.http.post<any>("http://localhost:8011/login-ws/users/login",{'email':username,'password':password}, {observe: 'response' as 'body'} )
    .pipe(
        map(
          data => {
            console.log('token is : ')
            console.log(data.headers.get('token'))
            
            sessionStorage.setItem(AUTHENTICATED_USER, username)
            sessionStorage.setItem(TOKEN, "bearer "+ data.headers.get('token'))
            return data;
          }
        )

      );
  

}





}
