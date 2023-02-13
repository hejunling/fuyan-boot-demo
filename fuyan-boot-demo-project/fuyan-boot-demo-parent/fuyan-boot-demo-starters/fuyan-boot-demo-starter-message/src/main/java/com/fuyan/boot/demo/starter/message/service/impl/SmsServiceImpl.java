/* fuyan.com Inc. Copyright (c) 2023 All Rights Reserved. */
package com.fuyan.boot.demo.starter.message.service.impl;

import com.fuyan.boot.demo.starter.message.properties.SmsProperties;
import com.fuyan.boot.demo.starter.message.service.ISmsService;
import com.google.common.base.Joiner;
import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SmsServiceImpl implements ISmsService {

  private String accessId;
  private String accessKey;
  private String accoundId;

  public SmsServiceImpl(SmsProperties smsProperties) {
    this.accessId = smsProperties.getAccessId();
    this.accessKey = smsProperties.getAccessKey();
    this.accoundId = smsProperties.getAccountId();
  }

  @Override
  public void send(String phone, String sign, String content) {
    String s =
        Hashing.md5()
            .hashBytes(
                Joiner.on(",")
                    .join(accessId, accessKey, accoundId, content)
                    .getBytes(StandardCharsets.UTF_8))
            .toString();
    log.info("md5 value = {}", s);
    log.info("sign = {}", sign);
    log.info("send sms success.....");
  }
}
