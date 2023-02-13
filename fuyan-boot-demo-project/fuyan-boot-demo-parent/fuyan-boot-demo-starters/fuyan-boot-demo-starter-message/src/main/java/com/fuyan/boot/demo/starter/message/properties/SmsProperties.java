/* fuyan.com Inc. Copyright (c) 2023 All Rights Reserved. */
package com.fuyan.boot.demo.starter.message.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "boot.message.sms")
public class SmsProperties {
  private String accessKey;
  private String accountId;
  private String accessId;
}
