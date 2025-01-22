package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMaintenanceRepo extends JpaRepository<VehicleMaintenance, Long> {
}
