import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { FormsModule } from "@angular/forms"; // <-- NgModel lives here
// HttpClient
import { HttpClientModule } from "@angular/common/http";

// services
import {BetminerService} from './shared/services/betminer.service';
import {WebSocketService} from './shared/services/websocket.service';

// ag-grid
import { AgGridModule } from "ag-grid-angular";
import { AppComponent } from "./app.component";



@NgModule({
  imports: [
    BrowserModule,
    FormsModule, // <-- import the FormsModule before binding with [(ngModel)]
    HttpClientModule,
    AgGridModule.withComponents([])
  ],
  declarations: [AppComponent],
  providers   : [BetminerService, WebSocketService],
  bootstrap: [AppComponent]
})
export class AppModule {}
