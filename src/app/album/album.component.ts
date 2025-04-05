import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Album } from './Album';
import { AlbumService } from '../services/album.service';
import { environment } from '../environments/environment';

@Component({
  selector: 'app-album',
  imports: [CommonModule],
  templateUrl: './album.component.html',
  styleUrl: './album.component.css'
})
export class AlbumComponent {
  albums: Album[]=[];

  constructor(private albumService: AlbumService){
    this.obterAlbumsRecentes();
    console.log('TO AQUI', environment.api);
  }

  obterAlbumsRecentes(){
    this.albumService.obterAlbums().subscribe(albums => this.albums = albums)
  }
}
