package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {
}
