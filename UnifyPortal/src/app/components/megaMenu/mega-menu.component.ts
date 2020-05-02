import { Component, OnInit } from '@angular/core';
import * as $ from 'Resources/vendor/jquery/jquery.min.js';

@Component({
  selector: 'app-mega-menu',
  templateUrl: './mega-menu.component.html',
  styleUrls: ['./mega-menu.component.css']
})
export class MegaMenuComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
   
    this.initMenu();


  }

initMenu(){
 console.log("mega menu works !") 


}


}
