import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { catchError, Observable, of } from 'rxjs';
import { ErrorDialogComponent } from 'src/app/shared/components/error-dialog/error-dialog.component';

import { Schedule } from '../model/schedule';
import { SchedulesService } from '../services/schedules.service';

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

  constructor(
    private schedulesService: SchedulesService,
    public dialog: MatDialog    
  ) { 
    // this.schedulesService = new SchedulesService();
    this.schedules$ = this.schedulesService.list()
    .pipe(
      catchError(error => {
        this.onError('Erro ao carregar cursos.');
        return of([])
      })
    );  
    // this.schedulesService.list().subscribe(schedules_data => this.schedules_data = schedules_data)
  } 

  onError(errorMsg: string) {
    this.dialog.open(ErrorDialogComponent, {
      data: errorMsg
    });
  }

  ngOnInit(): void {
  }

}
