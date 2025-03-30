package com.playrater.Playrater.controller;


import com.playrater.Playrater.client.Album;
import com.playrater.Playrater.client.AlbumSpotifyClient;
import com.playrater.Playrater.client.AuthSpotifyClient;
import com.playrater.Playrater.client.LoginRequest;
import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

  @GetMapping("/albums")
  public ResponseEntity<List<Album>> helloWorld() {

    var request = new LoginRequest(
      "client_credentials",
      clientId,clientSecret
    );
    var token = authSpotifyClient.login(request).getAccessToken();

    var response = albumSpotifyClient.getReleases("Bearer " + token);


    return ResponseEntity.ok(response.getAlbuns().getItens());
  }
}
