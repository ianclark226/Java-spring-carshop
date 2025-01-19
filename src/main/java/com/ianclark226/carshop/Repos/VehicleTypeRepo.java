package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepo extends JpaRepository<VehicleType, Integer> {
}
