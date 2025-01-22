package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStatusRepo extends JpaRepository<VehicleStatus, Integer> {
}
