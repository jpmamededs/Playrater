import { Component } from '@angular/core';
import { DecoCardComponent } from "../../landing/landingComponents/deco-card/deco-card.component";

@Component({
  selector: 'app-login',
  imports: [DecoCardComponent],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
}
