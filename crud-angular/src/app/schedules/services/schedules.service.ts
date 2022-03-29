import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { first, tap, delay } from 'rxjs/operators';

import { Schedule } from '../model/schedule';

@Injectable({
  providedIn: 'root'
})
export class SchedulesService {

  private readonly API = '/api/schedules';

  constructor(private httpClient: HttpClient) { }

  list(){
      return this.httpClient.get<Schedule[]>(this.API)
      .pipe(
        first(),
        delay(2000),
        tap(schedules => console.log(schedules))
      );
  }
}
