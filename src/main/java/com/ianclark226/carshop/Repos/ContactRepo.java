package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Integer> {
}
