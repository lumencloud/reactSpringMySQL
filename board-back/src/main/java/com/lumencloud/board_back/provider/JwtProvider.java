package com.lumencloud.board_back.provider;

import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component  //자바빈으로 등록
public class JwtProvider {
  private String secretKey = "SecretK3y";

  public String create(String email){

    Date expiredDate = Date.from(Instant.now().plus(1, ChronoUnit.HOURS));

    String jwt = Jwts.builder()
  }
}
