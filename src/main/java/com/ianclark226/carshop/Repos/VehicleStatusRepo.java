package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleStatusRepo extends JpaRepository<VehicleStatus, Integer> {
}
