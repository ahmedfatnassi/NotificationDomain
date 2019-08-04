package com.notification.domain.notification.notification.service;

import com.notification.domain.notification.notification.entities.Notification;
import com.notification.domain.notification.notification.repositories.NotificationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
@Transactional
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public List<Notification> findAll(){
        log.debug("request to get all carts");
        return this.notificationRepository.findAll() ;

    }
    public Notification create (Notification  notification){
        Notification myNotification = new Notification(notification.isRead(),notification.getReadAt(),notification.getTemplate(),notification.getUserID());
        notificationRepository.save(myNotification);
        return myNotification;

    }
    @Transactional
    public Notification findById(Long id){
        log.debug("Request to get cart : {}" , id );
        return this.notificationRepository.findById(id).map(NotificationService::mapToDto).orElse(null) ;
    }
    public static Notification mapToDto (Notification notification){
        if(notification!=null){
            return new Notification(notification.isRead(),notification.getReadAt(),notification.getTemplate(),notification.getUserID()) ;
        }
        return null ;
    }
}
