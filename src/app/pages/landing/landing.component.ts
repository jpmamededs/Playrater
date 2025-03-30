import { Component } from '@angular/core';
import { NavbarComponent } from './landingComponents/navbar/navbar.component';
import { MainframeComponent } from "./landingComponents/mainframe/mainframe.component";

@Component({
  selector: 'app-landing',
  imports: [NavbarComponent, MainframeComponent],
  templateUrl: './landing.component.html',
  styleUrl: './landing.component.css'
})
export class LandingComponent {

}
