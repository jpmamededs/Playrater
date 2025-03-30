package com.playrater.Playrater.client;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }
}
