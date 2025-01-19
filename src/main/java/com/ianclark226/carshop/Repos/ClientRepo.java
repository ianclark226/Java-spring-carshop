package com.ianclark226.carshop.Repos;



import com.ianclark226.carshop.Models.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Clients, Integer> {
}
