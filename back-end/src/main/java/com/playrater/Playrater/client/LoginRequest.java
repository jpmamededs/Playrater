package com.playrater.Playrater.client;

import feign.form.FormProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginRequest {

  @FormProperty("grant_type")
  private String grantType;

  @FormProperty("client_id")
  private String clientId;

  @FormProperty("client_secret")
  private String clientSecret;


}
