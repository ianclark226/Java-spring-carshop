package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends JpaRepository<Location, Integer> {
}
