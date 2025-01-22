package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleRepo extends JpaRepository<JobTitle, Long> {
}
