import { Component, OnInit } from '@angular/core';
import { DatePipe } from '@angular/common';
import { AuthorizationSearchService, TransactionModel } from 'src/app/Services/AuthorizationTransactionSearch/authorization-search.service';

@Component({
  selector: 'app-authorization-simple-search',
  templateUrl: './authorization-simple-search.component.html',
  styleUrls: ['./authorization-simple-search.component.css'],
  providers: [DatePipe]
})

export class AuthorizationSimpleSearchComponent implements OnInit {

  constructor(private datePipe: DatePipe, private authorizationSearchService: AuthorizationSearchService) {
    let currentDate: String = this.datePipe.transform(new Date(), 'yyyy-MM-dd');
    this.transactionSearchCriteriaModel = new TransactionSearchCriteriaModel('', '', '', currentDate, currentDate)
  }

  hasResult: boolean = false;

  transactionSearchCriteriaModel: TransactionSearchCriteriaModel;
  searchResults: TransactionModel[];

  ngOnInit(): void {
  }


  searchBtnClicked() {
    console.log(this.transactionSearchCriteriaModel)

    let result = this.authorizationSearchService.Search(this.transactionSearchCriteriaModel);

    result.subscribe(
      response => {
       
       
       
        console.log("response");
        console.log(response);
       
       
        console.log('response.data')
        console.log(response.data)

        console.log('third level')
        console.log(response.body.data.content)

        this.searchResults = response.body.data.content;
        this.hasResult = true;
      },
      error => {
        console.log("error occured")
        console.log(error);

      }
    )

  }

}

export class TransactionSearchCriteriaModel {

  constructor(
    public transactionId: String,
    public pan: String,
    public msgtype: String,
    public CreationDateFrom: String,
    public CreationDateto: String,
  ) { }

}
