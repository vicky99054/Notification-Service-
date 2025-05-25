package com.notificationService.Controller;


import com.notificationService.Service.notificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private notificationService notificationService;


    @GetMapping("/")
    public String SendMail(){

        String email= "vickykumaryadav736@gmail.com";
        String sub=" Check message from springboot";
        String message="Message from spring-boot";
        notificationService.SendNotification(email,sub,message);

        return "notification send Sucessfully";
    }

}
