import { Component, OnInit } from '@angular/core';
import { DatePipe } from '@angular/common';
import { AuthorizationSearchService } from 'src/app/Services/AuthorizationTransactionSearch/authorization-search.service';
import { error } from 'protractor';


@Component({
  selector: 'app-authorization-simple-search',
  templateUrl: './authorization-simple-search.component.html',
  styleUrls: ['./authorization-simple-search.component.css'],
  providers: [DatePipe]
})
export class AuthorizationSimpleSearchComponent implements OnInit {

  constructor(private datePipe: DatePipe ,private authorizationSearchService :AuthorizationSearchService ) {
    let currentDate: String = this.datePipe.transform(new Date(), 'yyyy-MM-dd');
    this.transactionSearchCriteriaModel = new TransactionSearchCriteriaModel('', '', '', currentDate, currentDate)
  }

  hasResult: boolean = false;

  transactionSearchCriteriaModel: TransactionSearchCriteriaModel;


  ngOnInit(): void {
  }


  searchBtnClicked() {
    console.log("searchBtnClicked");
    console.log(this.transactionSearchCriteriaModel)
    
    let result =   this.authorizationSearchService.Search();

    result.subscribe(
      response => console.log(response),
      error    => console.log(error)
    )

  }

}

export class TransactionSearchCriteriaModel {

  constructor(
    public transactionId: String,
    public PAN: String,
    public MSGTYPE: String,
    public CreationDateFrom: String,
    public CreationDateto: String,
  ) { }

}
