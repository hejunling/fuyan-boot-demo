/* fuyan.com Inc. Copyright (c) 2023 All Rights Reserved. */
package com.fuyan.boot.demo.starter.message.config;

import com.fuyan.boot.demo.starter.message.properties.SmsProperties;
import com.fuyan.boot.demo.starter.message.service.ISmsService;
import com.fuyan.boot.demo.starter.message.service.impl.SmsServiceImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SmsProperties.class)
public class SmsAutoConfiguration {
  @Bean
  public ISmsService smsService(SmsProperties smsProperties) {
    ISmsService smsService = new SmsServiceImpl(smsProperties);
    return smsService;
  }
}
