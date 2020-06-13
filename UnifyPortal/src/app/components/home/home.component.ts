import { Component, OnInit, AfterViewInit } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { HomeServiceService } from 'src/app/Services/Home/home-service.service';
declare var $: any;

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements AfterViewInit {

  ServerMessage: String= "any"

  constructor(private homeService: HomeServiceService) {
    this.getMessage();
  }

  ngAfterViewInit() {
    $(document).ready(function () {
      //alert('I am Called From jQuery');
      $.HSCore.components.HSGoTo.init('.js-go-to');
      $.HSCore.components.HSHeader.init($('#js-header'));
      $.HSCore.helpers.HSHamburgers.init('.hamburger');

      $('.js-mega-menu').HSMegaMenu({
        event: 'hover',
        pageContainer: $('.container'),
        breakpoint: 991
      });

    });

  }

  getMessage() {
    var result = this.homeService.GetMessage();
    result.subscribe(
      response =>{
        this.ServerMessage = response.message;
      } ,
      error => {
        console.log(error); 
      }
    );
   

  }

}
