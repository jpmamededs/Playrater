import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { environment } from "../environments/environment";
import { Album } from "../album/Album";

@Injectable({providedIn: 'root'})
export class AlbumService{

    private url = environment.api;

    constructor(private httpClient: HttpClient){
    }

    obterAlbums(){
        return this.httpClient.get<Album[]>(this.url + '/spotify/api/albums')
    }


}