import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class AuthorizationSearchService {

  constructor(private http:HttpClient) { }
  Search()
  {

    
    return this.http.get<ResponseModel>("http://m-lewes.egyptianbanks.net:8011/home-ws/api/v1/home/status/check")
  }

}


export class ResponseModel {

 constructor ( public responseCode:String , public responseMessage:String, public data:Page ){}

}

export class Page {

  constructor(public content :TransactionModel[] ){}

}

export class TransactionModel{
  constructor( TransactionId:String , MSGTYPE:String   ){}
}
