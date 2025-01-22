package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface VehicleHireRepo extends JpaRepository<VehicleHire, Integer> {
}
