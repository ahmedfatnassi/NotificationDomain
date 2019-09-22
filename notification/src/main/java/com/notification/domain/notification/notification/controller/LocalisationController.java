package com.notification.domain.notification.notification.controller;

import com.notification.domain.notification.notification.entities.Localisation;
import com.notification.domain.notification.notification.service.LocalisationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("localisation")
@RestController
public class LocalisationController {
    private final LocalisationService localisationService ;
    @GetMapping
    public List<Localisation> findAll(){
        return this.localisationService.findAll();
    }
    @PostMapping()
    public Localisation create(@RequestBody Localisation localisation){
        return this.localisationService.create(localisation);
    }
}

