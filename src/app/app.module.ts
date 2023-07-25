import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { CardModule, } from 'primeng/card';
import { TabMenuModule } from 'primeng/tabmenu';
import { TabViewModule } from 'primeng/tabview';
import { NumberComponent } from './number/number.component';
import { CollectionComponent } from './collection/collection.component';
import { StringComponent } from './home/string/string.component';
import { FormsModule } from '@angular/forms';
import { InputMaskModule } from 'primeng/inputmask';
// import { InputSwitchModule } from 'primeng/inputswitch';
import { InputTextModule } from 'primeng/inputtext';
// import { InputNumberModule } from 'primeng/inputnumber';
import { InputTextareaModule } from 'primeng/inputtextarea';
import { ButtonModule } from 'primeng/button';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    NumberComponent,
    StringComponent,
    CollectionComponent,
  ],
  imports: [
    BrowserModule,
    InputMaskModule,
    InputTextModule,
    InputTextareaModule,
    AppRoutingModule,
    CardModule,
    TabMenuModule,
    TabViewModule,
    FormsModule,
    ButtonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
