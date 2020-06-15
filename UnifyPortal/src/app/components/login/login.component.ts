import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginServiceService } from 'src/app/services/Login/login-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginUserPMO: loginUserModel = new loginUserModel('', '')
  errorMessage = ""
  constructor(private router: Router,
    private loginService: LoginServiceService

  ) { }

  ngOnInit(): void {
    sessionStorage.clear()
  }

  savebtnClicked() {

    console.log('login button clicked')
    console.log('user logged  " ' + this.loginUserPMO.username)
    console.log('password logged  :' + this.loginUserPMO.password)

    if (this.loginUserPMO.username === "") this.errorMessage = "username is required !"
    if (this.loginUserPMO.password === "") this.errorMessage = "password is required !"
    if (this.loginUserPMO.username === "" && this.loginUserPMO.password === "") this.errorMessage = "username and password are required !"


    if (this.loginUserPMO.username != "" && this.loginUserPMO.password != "")
     this.ExecuteLogin()

  }




  FakeExecuteLogin() {

    
    if (this.loginUserPMO.username === "")
      this.errorMessage = "username is required !"

    if (this.loginUserPMO.password === "")
      this.errorMessage = "password is required !"

    if (this.loginUserPMO.username === "" && this.loginUserPMO.password === "")
      this.errorMessage = "username and password are required !"

    this.loginService.ValidateLogin(this.loginUserPMO)

    if (sessionStorage.getItem("activeUser") === "monna") {
      this.router.navigate(['home'])

    } else {
      this.errorMessage = "username and password combination is not correct !"
    }

  }


  ExecuteLogin() {
    this.loginService.executeAuthorizationService(this.loginUserPMO.username, this.loginUserPMO.password).subscribe(
      data => {

        console.log('login success start');
        console.log(data.headers.get('token'));
      
        sessionStorage.setItem('activeUser', "monna");
        this.router.navigate(['home']);

       console.log('login success done !');
  
      },
      error => {
        this.errorMessage = "username , password combination is not correct";
        console.log('error occured')
        console.log(error)
      }
    )
  }


}



export class loginUserModel {
  constructor(public username: string, public password: string) { }

}
