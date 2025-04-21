import { Component, Input } from '@angular/core';
import { DecoCardComponent } from "../deco-card/deco-card.component";

@Component({
  selector: 'app-mainframe',
  imports: [DecoCardComponent],
  templateUrl: './mainframe.component.html',
  styleUrl: './mainframe.component.css'
})
export class MainframeComponent {
}
