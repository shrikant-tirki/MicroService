package com.bel.training.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bel.training.jwt.model.Role;
import com.bel.training.jwt.model.Roles;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Optional<Role> findByRoleName(Roles role);
}
