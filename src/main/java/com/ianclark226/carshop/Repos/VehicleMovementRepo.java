package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMovementRepo extends JpaRepository<VehicleMovement, Long> {
}
