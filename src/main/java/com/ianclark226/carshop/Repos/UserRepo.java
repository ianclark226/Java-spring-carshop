package com.ianclark226.carshop.Repos;

import com.ianclark226.carshop.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
