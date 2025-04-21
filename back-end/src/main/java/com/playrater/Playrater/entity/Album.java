package com.playrater.Playrater.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Album {

  @JsonProperty("id")
  private String id;
  @JsonProperty("name")
  private String name;
  @JsonProperty("release_date")
  private String relaseDate;
  @JsonProperty("artists")
  private List<Artists> artists;

}

