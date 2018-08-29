package com.mvc.bike.repositories;

import com.mvc.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BikeRepository extends JpaRepository<Bike, Long> {
}
