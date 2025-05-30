package com.playrater.Playrater.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Artist {

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;
}
