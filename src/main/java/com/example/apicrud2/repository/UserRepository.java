package com.example.apicrud2.repository;

import com.example.apicrud2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByName(String name);
    List<User> findAllByNameContainsIgnoreCase(String name);
    List<User> findAllByNameAndEmail(String name, String email);
    List<User> findAllByNameOrderByEmailAsc(String name);
}
