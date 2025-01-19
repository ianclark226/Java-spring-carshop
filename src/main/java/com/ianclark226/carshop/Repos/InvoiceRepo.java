package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepo extends JpaRepository<Invoice, Integer> {
}
