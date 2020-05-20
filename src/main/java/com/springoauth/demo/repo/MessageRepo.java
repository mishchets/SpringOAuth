package com.springoauth.demo.repo;

import com.springoauth.demo.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}