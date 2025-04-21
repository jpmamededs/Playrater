import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-deco-card',
  imports: [],
  templateUrl: './deco-card.component.html',
  styleUrl: './deco-card.component.css'
})
export class DecoCardComponent {
  @Input() numberOfStars: string = '';
  @Input() src: string = '';
  @Input() albumName: string = '';
  @Input() releaseDate: string = '';
  @Input() artist: string = '';
}
