import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-mainframe',
  imports: [],
  templateUrl: './mainframe.component.html',
  styleUrl: './mainframe.component.css'
})
export class MainframeComponent {
  @Input() imageUrl: string = 'static/David_Guetta_-_Nothing_but_the_Beat.png'
}
