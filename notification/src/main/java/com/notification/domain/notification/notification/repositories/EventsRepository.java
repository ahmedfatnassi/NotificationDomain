package com.notification.domain.notification.notification.repositories;

import com.notification.domain.notification.notification.entities.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<Events,Long> {
}
