package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepo extends JpaRepository<InvoiceStatus, Integer> {
}
