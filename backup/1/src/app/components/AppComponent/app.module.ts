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

import { HttpClientModule  } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    MegaMenuComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    ErrorComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
