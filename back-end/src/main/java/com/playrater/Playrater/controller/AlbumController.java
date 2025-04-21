package com.playrater.Playrater.controller;


import com.playrater.Playrater.entity.Album;
import com.playrater.Playrater.client.AlbumSpotifyClient;
import com.playrater.Playrater.client.AuthSpotifyClient;
import com.playrater.Playrater.client.LoginRequest;
import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Data
@RestController
@RequestMapping("/spotify/api")
public class AlbumController {

  private final AuthSpotifyClient authSpotifyClient;
  private final AlbumSpotifyClient albumSpotifyClient;
  @Value("${ClientID}")
  private String clientId;

  @Value("${ClientSecret}")
  private String clientSecret;

  public AlbumController(AuthSpotifyClient authSpotifyClient,
                         AlbumSpotifyClient albumSpotifyClient) {
    this.authSpotifyClient = authSpotifyClient;
    this.albumSpotifyClient = albumSpotifyClient;
  }

  @GetMapping("/albums/{id}")
  public ResponseEntity<Album> getAlbumById(@PathVariable String id) {
    var request = new LoginRequest("client_credentials", clientId, clientSecret);
    var token = authSpotifyClient.login(request).getAccessToken();

    Album album = albumSpotifyClient.getAlbumById("Bearer " + token, id);

    return ResponseEntity.ok(album);
  }
}
