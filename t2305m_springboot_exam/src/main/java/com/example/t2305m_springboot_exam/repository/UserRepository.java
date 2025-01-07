package com.example.t2305m_springboot_exam.repository;

import com.example.t2305m_springboot_exam.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByNameContains(String name);
}
