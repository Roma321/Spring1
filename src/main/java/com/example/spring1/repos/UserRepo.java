package com.example.spring1.repos;

import com.example.spring1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo  extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
