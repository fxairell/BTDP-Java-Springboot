package com.example.BelajarAPISQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BelajarAPISQL.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
