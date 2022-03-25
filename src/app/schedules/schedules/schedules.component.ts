import { Component, OnInit } from '@angular/core';
import { Schedule } from '../model/schedule';
import { SchedulesService } from '../services/schedules.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-schedules',
  templateUrl: './schedules.component.html',
  styleUrls: ['./schedules.component.scss']
})
export class SchedulesComponent implements OnInit {
  
  schedules$: Observable<Schedule[]>;
  // schedules_data: Schedule[] = []; 
  displayedColumns = ['teacher', 'course', 'time'];

  // schedulesService: SchedulesService;

  constructor(private schedulesService: SchedulesService) { 
    // this.schedulesService = new SchedulesService();
    this.schedules$ = this.schedulesService.list();  
    // this.schedulesService.list().subscribe(schedules_data => this.schedules_data = schedules_data)
  } 

  ngOnInit(): void {
  }

}
