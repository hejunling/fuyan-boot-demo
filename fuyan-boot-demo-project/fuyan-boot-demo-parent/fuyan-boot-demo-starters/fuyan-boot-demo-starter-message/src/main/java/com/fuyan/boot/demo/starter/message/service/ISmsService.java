/* fuyan.com Inc. Copyright (c) 2023 All Rights Reserved. */
package com.fuyan.boot.demo.starter.message.service;

public interface ISmsService {
  void send(String phone, String sign, String content);
}
