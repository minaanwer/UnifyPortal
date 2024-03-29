import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class HomeServiceService {

  constructor(private http:HttpClient) { }

  GetMessage()
  {
    return this.http.get<StatusResponse>("http://m-lewes.egyptianbanks.net:8011/home-ws/api/v1/home/status/check")
  //http://localhost:8011/login-ws/users/status/check/temp
  
  //return this.http.get<StatusResponse>("http://localhost:8011/login-ws/users/status/check/temp")
  }


}

export class StatusResponse {
  constructor(public message:String){}
}
