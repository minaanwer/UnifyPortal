import { Component, OnInit } from '@angular/core';
import { LoginServiceService } from 'src/app/services/Login/login-service.service';

@Component({
  selector: 'app-mega-menu',
  templateUrl: './mega-menu.component.html',
  styleUrls: ['./mega-menu.component.css']
})
export class MegaMenuComponent implements OnInit {

  isActiveUser:boolean

  LoginService :LoginServiceService

  constructor(myLoginService: LoginServiceService ) {
    this.LoginService = myLoginService
   }

  ngOnInit(): void {

  }

}
