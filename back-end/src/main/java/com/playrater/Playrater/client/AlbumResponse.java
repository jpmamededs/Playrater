package com.playrater.Playrater.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class AlbumResponse {


  @JsonProperty("albums")
  private AlbumWrapper albums;
}
