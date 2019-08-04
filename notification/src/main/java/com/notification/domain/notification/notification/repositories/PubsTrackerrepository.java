package com.notification.domain.notification.notification.repositories;

import com.notification.domain.notification.notification.entities.PubsTracker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PubsTrackerrepository  extends JpaRepository<PubsTracker,Long> {
}
