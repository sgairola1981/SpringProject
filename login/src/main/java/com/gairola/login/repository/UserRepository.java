package com.gairola.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gairola.login.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

}
