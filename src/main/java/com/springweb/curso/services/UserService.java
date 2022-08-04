package com.springweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb.curso.entities.Users;
import com.springweb.curso.repositories.userRepository;

@Service
public class UserService {

	//dependencia para userRepository
	@Autowired
	private userRepository userRepository;
	
	//retornar todos os usuarios
	public List<Users> findall() {
		return userRepository.findAll();
	}
	
	public Users findById(Long id) {
		Optional<Users> obj = userRepository.findById(id);
		return obj.get();
	}
}
