package com.springweb.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springweb.curso.entities.Users;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<Users> findAll() {
		Users u = new Users(1L, "Maria", "maria@gmail.com", "9999-9999", "1234");
		return ResponseEntity.ok().body(u);
	}
}
