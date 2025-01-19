package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
