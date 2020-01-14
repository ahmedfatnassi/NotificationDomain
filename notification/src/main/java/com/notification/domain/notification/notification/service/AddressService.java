package com.notification.domain.notification.notification.service;

import com.notification.domain.notification.notification.entities.Address;
import com.notification.domain.notification.notification.entities.Admin;
import com.notification.domain.notification.notification.repositories.AddressRepository;
import com.notification.domain.notification.notification.repositories.AdminRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
@Transactional
public class AddressService {
    private final com.notification.domain.notification.notification.repositories.AddressRepository addressRepository;
    public List<Address> findAll(){
        log.debug("request to get all carts");
        return this.addressRepository.findAll() ;

    }
    public void deleteAll(){
        addressRepository.deleteAll();
    }
    public Address create (Address address){
        Address myaddress = new Address(address.getAddress(),address.getState(),address.getRegion(),address.getCity(),address.getColor(),address.getCapacity(),address.getLatitude(),address.getLangitude());
        addressRepository.save(myaddress);
        return myaddress ;

    }

    @Transactional
    public Address findById(Long id){
        log.debug("Request to get cart : {}" , id );
        return this.addressRepository.findById(id).map(AddressService::mapToDto).orElse(null) ;
    }
    public static Address mapToDto (Address address){
        if(address!=null){
            return new Address(address.getAddress(),address.getState(),address.getRegion(),address.getCity(),address.getColor(),address.getCapacity(),address.getLatitude(), address.getLangitude()) ;
        }
        return null ;
    }
    public List<Address> findCitybyRegion(String region){
       return  addressRepository.findAllByRegion(region) ;
    }
}
