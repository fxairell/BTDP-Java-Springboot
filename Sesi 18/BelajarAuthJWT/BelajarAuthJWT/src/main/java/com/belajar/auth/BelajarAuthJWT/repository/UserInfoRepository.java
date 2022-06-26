package com.belajar.auth.BelajarAuthJWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.belajar.auth.BelajarAuthJWT.model.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{
    Boolean existsByUsername(String username);
    UserInfo findByUsername(String username);
}
