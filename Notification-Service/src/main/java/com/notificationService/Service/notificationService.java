package com.notificationService.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class notificationService {

    @Autowired
    private JavaMailSender mailSender;

    public void SendNotification( String email , String subject ,String Message){

        SimpleMailMessage mailMessage= new SimpleMailMessage();

        mailMessage.setTo(email);
        mailMessage.setSubject(subject);
        mailMessage.setText(Message);
       mailMessage.setFrom("vickykumar.ara10@gmail.com");

       mailSender.send(mailMessage);


    }
}
