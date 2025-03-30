package com.playrater.Playrater.controller;


import com.playrater.Playrater.client.AuthSpotifyClient;
import com.playrater.Playrater.client.LoginRequest;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/spotify")
@Data
public class AlbumController {

  public AlbumController(AuthSpotifyClient authSpotifyClient){
    this.authSpotifyClient = authSpotifyClient;
  }

  @Autowired
  private final AuthSpotifyClient authSpotifyClient;

  @Value("${ClientID}")
  private String clientId;

  @Value("${ClientSecret}")
  private String clientSecret;

  @GetMapping("/albums")
  public ResponseEntity<String> credenciais(){
    var request = new LoginRequest(
      "client_credentials",
      clientId,
      clientSecret
    );
    return ResponseEntity.ok(authSpotifyClient.login(request).getAccessToken);
  }

}
