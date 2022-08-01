package com.springweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springweb.curso.entities.Users;

public interface userRepository extends JpaRepository<Users, Long> {

	
}
