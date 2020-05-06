import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginServiceService } from 'src/app/services/DataServices/Login/login-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginUserPMO:loginUserModel = new loginUserModel('','')
  errorMessage = ""
  constructor(private router:Router ,private loginService : LoginServiceService ) { }

  ngOnInit(): void {
    this.initSession()
  }
  
  initSession(){
    console.log("initSession")
    sessionStorage.clear()
  }


  savebtnClicked(){
    console.log("loginUserPMO")
    console.log(this.loginUserPMO)
     
    if(this.loginUserPMO.username === "" )
     this.errorMessage = "username is required !"

    if(this.loginUserPMO.password === "" )
     this.errorMessage = "password is required !"
    
    if(this.loginUserPMO.username === "" && this.loginUserPMO.password === "" )
     this.errorMessage = "username and password are required !"
    
     console.log("we here !")
    
     this.loginService.ValidateLogin(this.loginUserPMO)

     if(localStorage.getItem("activeUser"))
     this.router.navigate(['home'])

   }

}

export class loginUserModel{
constructor(public username :string , public password:string){}

}
