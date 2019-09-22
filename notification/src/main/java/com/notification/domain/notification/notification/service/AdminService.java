package com.notification.domain.notification.notification.service;

import com.notification.domain.notification.notification.entities.Admin;
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
public class AdminService {
    private final AdminRepository AdminRepository;
    public List<Admin > findAll(){
        log.debug("request to get all carts");
        return this.AdminRepository.findAll() ;

    }
    public Admin create (Admin admin){
        Admin myadmin = new Admin(admin.getFirstname(),admin.getLastname(),admin.getSeriale_number());
        AdminRepository.save(myadmin);
        return admin ;

    }
    @Transactional
    public Admin findById(Long id){
        log.debug("Request to get cart : {}" , id );
        return this.AdminRepository.findById(id).map(AdminService::mapToDto).orElse(null) ;
    }
    public static Admin mapToDto (Admin admin){
        if(admin!=null){
            return new Admin(admin.getFirstname(),admin.getLastname(),admin.getSeriale_number()) ;
        }
        return null ;
    }
}
