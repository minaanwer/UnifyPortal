import { Injectable } from '@angular/core';
import { loginUserModel } from 'src/app/components/login/login.component';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  constructor() { }


  ValidateLogin(user: loginUserModel) {
    if (user.username === "monna" && user.password === "monna") {
      sessionStorage.setItem('activeUser', user.username);
    }
  }

  IsUserLogin() {
    let user = sessionStorage.getItem('activeUser');
    if (user === 'monna') {
      return true
    } else {
      return false;
    }

  }


}