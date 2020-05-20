package com.springoauth.demo.repo;

import com.springoauth.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}