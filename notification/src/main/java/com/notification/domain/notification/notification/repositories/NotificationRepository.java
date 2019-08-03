package com.notification.domain.notification.notification.repositories;

import com.notification.domain.notification.notification.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,Long> {
}
