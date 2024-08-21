package com.example.sampleecommerce.repository;

import com.example.sampleecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
   User save(User user);
   Optional<User> findByName(String name);
}
