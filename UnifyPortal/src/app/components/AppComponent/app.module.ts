import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MegaMenuComponent } from '../megaMenu/mega-menu.component';
import { FooterComponent } from '../footer/footer.component';
import { HomeComponent } from '../home/home.component';
import { LoginComponent } from '../login/login.component';
import { ErrorComponent } from '../error/error.component';
import { FormsModule } from '@angular/forms';

import { HttpClientModule, HTTP_INTERCEPTORS  } from '@angular/common/http';
import { AuthorizationSimpleSearchComponent } from '../authorization-simple-search/authorization-simple-search.component';
import { SpinLoaderComponent } from '../spin-loader/spin-loader.component';
import { LoaderInterceptorService } from '../../Services/interceptors/loader-interceptor.service';


@NgModule({
  declarations: [
    AppComponent,
    MegaMenuComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    ErrorComponent,
    AuthorizationSimpleSearchComponent,
    SpinLoaderComponent


    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule 
  ],
  providers: [ { provide: HTTP_INTERCEPTORS, useClass: LoaderInterceptorService, multi: true}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
