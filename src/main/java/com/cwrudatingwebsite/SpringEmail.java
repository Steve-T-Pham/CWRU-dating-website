package com.cwrudatingwebsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SpringEmail{

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(String recipient, String subject, String body) {
        try{
            SimpleMailMessage message = new SimpleMailMessage(); 
            message.setFrom("stevesmessagebot@gmail.com");
            message.setTo(recipient); 
            message.setSubject(subject); 
            message.setText(body);
            emailSender.send(message);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

