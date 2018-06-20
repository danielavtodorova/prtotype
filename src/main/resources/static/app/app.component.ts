import { Component, ViewChild } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import {Component, OnInit} from '@angular/core';
import {BetminerService} from './shared/services/betminer.service';
import "ag-grid-enterprise";

@Component({
  selector: "my-app",
  template: `<ag-grid-angular
    #agGrid
    style="width: 100%; height: 100%;"
    id="myGrid"
    [rowData]="rowData"
    class="ag-theme-balham"
    [columnDefs]="columnDefs"
    [animateRows]="true"
    [enableRangeSelection]="true"
    [enableSorting]="true"
    [enableFilter]="true"
    (gridReady)="onGridReady($event)"
    ></ag-grid-angular>`
})
export class AppComponent {
  private gridApi;
  private gridColumnApi;
  private rowData: any[];

  private columnDefs;
//private http: HttpClient,
  constructor(private betminerService:BetminerService) {
    this.columnDefs = [
      {
        headerName: "Date",
        field: "date",
        width: 90
      },
      {
        headerName: "Event",
        field: "event",
        width: 90
      },
      {
        headerName: "Market",
        field: "market",
        width: 90
      },
      {
        headerName: "Selection",
        field: "selection",
        width: 90
      },
      {
        headerName: "Betslip",
        field: "betslip",
        width: 90
      },
      {
        headerName: "Liability",
        field: "liability",
        width: 90
      },
      {
        headerName: "Stake",
        field: "stake",
        width: 90
      },
      {
        headerName: "Odds",
        field: "odd",
        width: 100
      },
      {
        headerName: "Profile",
        field: "profile",
        cellTemplate: "<a href='#'></a>",
        width: 90
      },
      {
        headerName: "Date",
        field: "date",
        width: 80
      },
      {
        headerName: "Betslipid",
        field: "betslipid",
        width: 80,
        rowGroup: true
      }
    ];
  }

  onGridReady(params) {
    this.gridApi = params.api;
    this.gridColumnApi = params.columnApi;
    
  	this.betminerService.rowData.subscribe(num => {
			this.rowData.push(num);
			// reset if there are 20 numbers in the array
			if (this.rowData.length > 100) {
				this.rowData = [];
			}
		})
  }
}
