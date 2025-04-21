package com.playrater.Playrater.client;

import com.playrater.Playrater.entity.Album;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "AlbumSpotifyClient", url = "https://api.spotify.com")
public interface AlbumSpotifyClient {

  @GetMapping("/v1/albums/{id}")
  Album getAlbumById(@RequestHeader("Authorization") String token,
                     @PathVariable("id") String id);
}
