package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTypeRepo extends JpaRepository<EmployeeType, Integer> {
}
