package com.example.Hotel.repositories;

import com.example.Hotel.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);

}
