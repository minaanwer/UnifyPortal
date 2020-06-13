import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-authorization-simple-search',
  templateUrl: './authorization-simple-search.component.html',
  styleUrls: ['./authorization-simple-search.component.css']
})
export class AuthorizationSimpleSearchComponent implements OnInit {

  constructor() { }

  hasResult :boolean= false;

  transactionSearchCriteriaModel:TransactionSearchCriteriaModel;

  ngOnInit(): void {
    this.transactionSearchCriteriaModel = new TransactionSearchCriteriaModel('na','na','na','na','na') 
  }


  searchBtnClicked(){
    console.log("searchBtnClicked");
  }

}

export class TransactionSearchCriteriaModel {

constructor(
  public CreationDateFrom : String , 
  public CreationDateto : String ,
  public transactionId:String,
  public PAN : String ,
  public MSGTYPE : String,

  ){}


}
