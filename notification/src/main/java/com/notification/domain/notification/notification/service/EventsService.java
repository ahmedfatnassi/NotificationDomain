package com.notification.domain.notification.notification.service;

import com.notification.domain.notification.notification.entities.Events;
import com.notification.domain.notification.notification.repositories.EventsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
@Transactional
public class EventsService {
    private final EventsRepository eventsRepository;
    public List<Events> findAll(){
        log.debug("request to get all carts");
        return this.eventsRepository.findAll() ;

    }
    public Events create (Events events){
        Events myEvents = new Events(events.getSujet(),events.getDescription(),events.getCin(),events.getNumber(),events.getName(),events.getDate());
        eventsRepository.save(myEvents);
        return myEvents ;

    }
    @Transactional
    public Events findById(Long id){
        log.debug("Request to get cart : {}" , id );
        return this.eventsRepository.findById(id).map(EventsService::mapToDto).orElse(null) ;
    }
    public static Events mapToDto (Events events){
        if(events!=null){
            return new Events(events.getSujet(),events.getDescription(),events.getCin(),events.getNumber(),events.getName(),events.getDate()) ;
        }
        return null ;
    }
}

