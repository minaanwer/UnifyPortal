import { Component, OnInit } from '@angular/core';
import { LoaderService } from 'src/app/Services/Loader/loader.service';

@Component({
  selector: 'app-spin-loader',
  templateUrl: './spin-loader.component.html',
  styleUrls: ['./spin-loader.component.css']
})
export class SpinLoaderComponent implements OnInit {

  loading: boolean;
  constructor(private loaderService: LoaderService) {
    console.log("in  SpinLoaderComponent")
    this.loaderService.isLoading.subscribe(
      ((v) => {
        console.log(v);
        this.loading = v;
      })
    );
  }

  ngOnInit(): void {
  }

}
