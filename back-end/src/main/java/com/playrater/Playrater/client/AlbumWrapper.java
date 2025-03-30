package com.playrater.Playrater.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class AlbumWrapper {

  @JsonProperty("itens")
  private List<Album> itens;
}
