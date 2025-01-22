package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleMakeRepo extends JpaRepository<VehicleMake, Long> {
}
