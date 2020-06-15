import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { TransactionSearchCriteriaModel } from 'src/app/components/authorization-simple-search/authorization-simple-search.component';

@Injectable({
  providedIn: 'root'
})
export class AuthorizationSearchService {

  constructor(private http:HttpClient) { }
 
 
  Search(transactionSearchCriteriaModel:TransactionSearchCriteriaModel)
  {

    //return this.http.post<ResponseModel>("localhost:8011/transactions-ws/api/transaction/0" , transactionSearchCriteriaModel)
    return this.http.post<ResponseModel>("http://m-lewes.egyptianbanks.net:8080/api/transaction/0", transactionSearchCriteriaModel)
  
  }

}


export class ResponseModel {

 constructor ( public responseCode:String , public responseMessage:String, public data:Page ){}

}

export class Page {

  constructor(public content :TransactionModel[] ){}

}

export class TransactionModel{
  constructor( TransactionId:String , MSGTYPE:String ,pan:String,rrn:String, settlement_DATE:String,settlement_AMOUNT:String ){}
}
