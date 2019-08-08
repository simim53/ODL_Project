import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { IndexComponent } from './pages/index/index.component';
import {FilmComponent} from './pages/film/film.component';

export const appRouteList: Routes = [
  {
    path: 'accueil',
    component: IndexComponent
  },
  {
    path: 'film',
    component: FilmComponent
  },
  {
    path: '**',
    redirectTo: 'accueil'
  }
];

@NgModule({
  exports: [
    RouterModule
  ],
  imports: [
    RouterModule.forRoot(appRouteList)
  ]
})
export class AppRoutingModule {
}
