package com.notification.domain.notification.notification.repositories;

import com.notification.domain.notification.notification.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}
