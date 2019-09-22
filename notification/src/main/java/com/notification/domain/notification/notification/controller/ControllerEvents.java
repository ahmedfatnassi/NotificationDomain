package com.notification.domain.notification.notification.controller;

import com.notification.domain.notification.notification.entities.Events;
import com.notification.domain.notification.notification.service.EventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("events")
@RestController
public class ControllerEvents {

    private final EventsService eventsService ;

    @GetMapping
    public List<Events> findAll(){
        return this.eventsService.findAll();
    }
    @PostMapping()
    public Events create(@RequestBody Events events){
        return this.eventsService.create(events);
    }
}
