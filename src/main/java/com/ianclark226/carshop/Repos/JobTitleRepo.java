package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleRepo extends JpaRepository<JobTitle, Long> {
}
