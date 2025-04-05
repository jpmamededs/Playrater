import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { LandingComponent } from "./pages/landing/landing.component";
import { environment } from './environments/environment.development';
import { AlbumService } from './services/album.service';
import { Album } from './album/Album';
import { AlbumComponent } from "./album/album.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, LandingComponent, AlbumComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
  standalone: true
})
export class AppComponent {
  title = 'playrater';

}
