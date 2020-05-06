import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginServiceService } from 'src/app/services/DataServices/Login/login-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginUserPMO: loginUserModel = new loginUserModel('', '')
  errorMessage = ""
  constructor(private router: Router, private loginService: LoginServiceService) { }

  ngOnInit(): void {
    sessionStorage.clear()
  }

  savebtnClicked() {

    if (this.loginUserPMO.username === "")
      this.errorMessage = "username is required !"

    if (this.loginUserPMO.password === "")
      this.errorMessage = "password is required !"

    if (this.loginUserPMO.username === "" && this.loginUserPMO.password === "")
      this.errorMessage = "username and password are required !"

    this.loginService.ValidateLogin(this.loginUserPMO)

    if (sessionStorage.getItem("activeUser") === "monna") {
      this.router.navigate(['home'])
      
      //this.router.navigateByUrl('/menu', { skipLocationChange: true }).then(() => {
      //this.router.navigate(['home']);
      //}); 


    } else {
      this.errorMessage = "username and password combination is not correct !"
    }

  }

}

export class loginUserModel {
  constructor(public username: string, public password: string) { }

}
