package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleModelRepo extends JpaRepository<VehicleModel, Integer> {
}
