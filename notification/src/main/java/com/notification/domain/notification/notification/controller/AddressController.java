package com.notification.domain.notification.notification.controller;

import com.notification.domain.notification.notification.entities.Address;
import com.notification.domain.notification.notification.entities.Admin;
import com.notification.domain.notification.notification.service.AddressService;
import com.notification.domain.notification.notification.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("address")
@RestController
public class AddressController {
    private final AddressService addressService ;
    @GetMapping
    public List<Address> findAll(){
        return this.addressService.findAll();
    }

    @GetMapping("findbyregion")
    public List<Address> findByRegion(@RequestHeader("region") String region){
        System.out.println(region);
        return this.addressService.findCitybyRegion(region);
    }
    @PostMapping()
    public Address create(@RequestBody Address address){
        return this.addressService.create(address);
    }
}
