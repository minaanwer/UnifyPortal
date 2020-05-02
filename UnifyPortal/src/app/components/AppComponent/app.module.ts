import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MegaMenuComponent } from '../megaMenu/mega-menu.component';
import { FooterComponent } from '../footer/footer.component';
import { HomeComponent } from '../home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    MegaMenuComponent,
    FooterComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
