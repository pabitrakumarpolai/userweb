package com.userdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userdata.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
