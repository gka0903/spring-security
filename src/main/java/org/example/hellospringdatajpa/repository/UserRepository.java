package org.example.hellospringdatajpa.repository;

import java.util.Optional;
import org.example.hellospringdatajpa.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<MyUser, Long> {

    Optional<MyUser> findByEmail(String email);
}
