package com.notification.domain.notification.notification.repositories;

import com.notification.domain.notification.notification.entities.Localisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalisationRepository extends JpaRepository<Localisation,Long> {
}
