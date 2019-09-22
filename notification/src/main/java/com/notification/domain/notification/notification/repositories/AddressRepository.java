package com.notification.domain.notification.notification.repositories;

import com.notification.domain.notification.notification.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address,Long> {

    List<Address> findAllByRegion(String region);
}
