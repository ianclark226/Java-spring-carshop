package com.ianclark226.carshop.Services;

import com.ianclark226.carshop.Models.Country;
import com.ianclark226.carshop.Repos.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepo countryRepo;

    // Return list of countries
    public List<Country> getCountries() {
        return countryRepo.findAll();
    }
}
