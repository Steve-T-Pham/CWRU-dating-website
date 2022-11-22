/*package com.cwrudatingwebsite.cwrudating;
 
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cwrudatingwebsite.SpringEmail;
import com.icegreen.greenmail.configuration.GreenMailConfiguration;
import com.icegreen.greenmail.junit5.GreenMailExtension;

import com.icegreen.greenmail.util.ServerSetupTest;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmailTest {

  @RegisterExtension
  static GreenMailExtension greenMail = new GreenMailExtension(ServerSetupTest.SMTP)
    .withConfiguration(GreenMailConfiguration.aConfig().withUser("stevesmessagebot@gmail.com", "wikruzqnyjoroyzj"))
    .withPerMethodLifecycle(false);

  @Autowired
  private SpringEmail javaMailSender;

  @Test
  void shouldUseGreenMail() throws Exception {
    javaMailSender.sendSimpleMessage("stevesmessagebot@gmail.com", "test", "test");

  }
}*/