package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepo extends JpaRepository<VehicleMovement, Long> {
}
