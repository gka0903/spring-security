package org.example.hellospringdatajpa.repository;

import java.util.Optional;
import org.example.hellospringdatajpa.entity.MyRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<MyRole, Long> {

    Optional<MyRole> findByRolename(String rolename);
}
