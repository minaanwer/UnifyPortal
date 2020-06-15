import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { TransactionSearchCriteriaModel } from 'src/app/components/authorization-simple-search/authorization-simple-search.component';

@Injectable({
  providedIn: 'root'
})
export class AuthorizationSearchService {

  constructor(private http:HttpClient ) { }
 
 
  Search(transactionSearchCriteriaModel:TransactionSearchCriteriaModel)
  {
    let token =  sessionStorage.getItem('token');
    
    console.log('token befor send ' + token)
    const headers = new HttpHeaders().append('Authorization',`bearer ${token}`);


    return this.http.post<any>("http://localhost:8011/transactions-ws/api/transaction/0", transactionSearchCriteriaModel ,
    {headers: headers ,observe: 'response' as 'body' })  
  }

}


export class ResponseModel {

 constructor ( public responseCode:String , public responseMessage:String, public data:Page ){}

}

export class Page {

  constructor(public content :TransactionModel[] ){}

}

export class TransactionModel{
  constructor( TransactionId:String , MSGTYPE:String ,PAN:String,RRN:String, SETTLEMENT_RATE:String, ){}
}