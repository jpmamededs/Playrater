import { Routes } from '@angular/router';
import { LandingComponent } from './pages/landing/landing.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { LoginComponent } from './pages/login/login.component';

export const routes: Routes = [
  { path: '', component: LandingComponent }, // rota padrão
  { path: 'login', component: LoginComponent },
  { path: 'profile', component: ProfileComponent },
];
