package com.example.olympiads.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpa extends JpaRepository<Integer, User> {
}
