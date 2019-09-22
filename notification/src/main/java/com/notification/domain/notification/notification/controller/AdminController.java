package com.notification.domain.notification.notification.controller;

import com.notification.domain.notification.notification.entities.Admin;
import com.notification.domain.notification.notification.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("admin")
@RestController
public class AdminController {
    private final AdminService adminService ;
    @GetMapping
    public List<Admin> findAll(){
        return this.adminService.findAll();
    }
    @PostMapping()
    public Admin create(@RequestBody Admin admin){
        return this.adminService.create(admin);
    }
}
