package com.notification.domain.notification.notification.controller;

import com.notification.domain.notification.notification.entities.Notification;
import com.notification.domain.notification.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("notification")
@RestController
public class notificationController {
    private final NotificationService notificationService ;
     @GetMapping
    public List<Notification> findAll(){
         return this.notificationService.findAll();
     }
     @PostMapping()
    public Notification create(@RequestBody Notification notification){
         return this.notificationService.create(notification);
     }
}
