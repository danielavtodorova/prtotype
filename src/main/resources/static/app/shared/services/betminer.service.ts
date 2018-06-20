import {Injectable} from '@angular/core';
import {Subject} from 'rxjs/Subject';
import {WebSocketService} from './websocket.service';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/filter';

const DATA_URL = 'ws://localhost:8080/websocket';

@Injectable()
export class BetminerService {
	public messages: Subject<Message>  = new Subject<Message>();
	public rowData: Subject<number> = new Subject<number>();

	constructor(private wsService: WebSocketService) {
		// 1. subscribe to random data
		this.rowData = <Subject<number>>this.wsService
			.connectData(DATA_URL)
			.map((response: any): number => {
				return response.data;
			});
	}
} // end class BetminerService