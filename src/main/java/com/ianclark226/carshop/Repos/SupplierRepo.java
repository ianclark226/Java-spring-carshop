package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<Supplier, Integer> {
}
