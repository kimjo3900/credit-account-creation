import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatSliderModule } from '@angular/material/slider';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './navbar/navbar.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { CarouselComponent } from './carousel/carousel.component';
import { ButtonComponent } from './button/button.component';

const MaterialComponents = [
  BrowserModule,
  AppRoutingModule,
  BrowserAnimationsModule,
  MatToolbarModule,
  MatSliderModule,
  MatButtonModule,
  MatIconModule,
];
@NgModule({
  declarations: [AppComponent, NavbarComponent, CarouselComponent, ButtonComponent],
  imports: [MaterialComponents, NgbModule],
  exports: [MaterialComponents],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
