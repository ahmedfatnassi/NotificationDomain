package com.notification.domain.notification.notification.service;

import com.notification.domain.notification.notification.entities.Localisation;
import com.notification.domain.notification.notification.repositories.LocalisationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
@Transactional
public class LocalisationService {
    private final LocalisationRepository LocalisationRepository;

    public List<Localisation> findAll(){
        log.debug("request to get all carts");
        return this.LocalisationRepository.findAll() ;

    }
    public Localisation create (Localisation localisation){
        Localisation myLocalisation = new Localisation(localisation.getLatitude(),localisation.getLongitude(),localisation.getType(),localisation.getDate());
        LocalisationRepository.save(myLocalisation);
        return myLocalisation ;

    }
    @Transactional
    public Localisation findById(Long id){
        log.debug("Request to get cart : {}" , id );
        return this.LocalisationRepository.findById(id).map(LocalisationService::mapToDto).orElse(null) ;
    }
    public static Localisation mapToDto (Localisation localisation){
        if(localisation!=null){
            return new Localisation(localisation.getLatitude(),localisation.getLongitude(),localisation.getType(),localisation.getDate()) ;
        }
        return null ;
    }
}
