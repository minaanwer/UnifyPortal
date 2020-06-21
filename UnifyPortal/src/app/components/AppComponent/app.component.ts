import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = 'angular-interceptor-loader';

  constructor(
    public http: HttpClient
  ) { }

  makeHttpCall() {
    console.log("in makeHttpCall")
    this.http.get('http://slowwly.robertomurray.co.uk/delay/200000/url/http://www.google.co.uk')
      .subscribe((r) => {
        console.log("r");
        console.log(r);
      });
  }

}
