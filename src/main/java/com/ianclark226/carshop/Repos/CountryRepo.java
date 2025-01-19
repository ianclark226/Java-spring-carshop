package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country, Integer> {
}
