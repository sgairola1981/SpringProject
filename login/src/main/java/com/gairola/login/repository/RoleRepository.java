package com.gairola.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gairola.login.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}