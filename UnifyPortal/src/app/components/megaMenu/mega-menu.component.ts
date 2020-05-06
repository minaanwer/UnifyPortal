import { Component, OnInit } from '@angular/core';
import * as $ from 'Resources/vendor/jquery/jquery.min.js';

@Component({
  selector: 'app-mega-menu',
  templateUrl: './mega-menu.component.html',
  styleUrls: ['./mega-menu.component.css']
})
export class MegaMenuComponent implements OnInit {

  constructor() { }

  isActiveUser: boolean

  ngOnInit(): void {
    this.initMenu();
  }

  initMenu() {
    let username = sessionStorage.getItem('activeUser')

    if (!(username === '' || username === null))
      this.isActiveUser = true;
    else
      this.isActiveUser = false

    console.log('username is XXX : ' + username)
  }


}
