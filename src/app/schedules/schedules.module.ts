import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';

import { AppMaterialModule } from '../shared/app-material/app-material.module';
import { SchedulesRoutingModule } from './schedules-routing.module';
import { SchedulesComponent } from './schedules/schedules.component';


@NgModule({
  declarations: [
    SchedulesComponent
  ],
  imports: [
    CommonModule,
    SchedulesRoutingModule,
    AppMaterialModule,
    MatProgressSpinnerModule
  ]
})
export class SchedulesModule { }
