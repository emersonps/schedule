import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
// import { SchedulesComponent } from './Schedules/Schedules/Schedules.component';

const routes: Routes = [
  {path: '', pathMatch: 'full', redirectTo: 'schedules'},
  {path: 'schedules', loadChildren: () => import('./schedules/schedules.module').then(m => m.SchedulesModule)}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
