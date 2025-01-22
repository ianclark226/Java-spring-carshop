package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceStatusRepo extends JpaRepository<InvoiceStatus, Integer> {
}
