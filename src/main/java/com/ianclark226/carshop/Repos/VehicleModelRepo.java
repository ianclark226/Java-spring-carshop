package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface VehicleModelRepo extends JpaRepository<VehicleModel, Long> {
}
