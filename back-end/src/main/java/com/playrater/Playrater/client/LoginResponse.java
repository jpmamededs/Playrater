package com.playrater.Playrater.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class LoginResponse {
  @JsonProperty("access_token")
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }
}
