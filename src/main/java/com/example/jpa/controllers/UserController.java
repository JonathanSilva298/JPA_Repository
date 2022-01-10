package com.example.jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entities.User;
import com.example.jpa.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository repository;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> result = repository.findAll();
		return ResponseEntity.ok(result);
	}

	@GetMapping("/page")
	public ResponseEntity<Page<User>> findAll(Pageable pageable) {
		Page<User> result = repository.findAll(pageable);
		return ResponseEntity.ok(result);
	}
	@PostMapping("/save")
	public String Save(@RequestParam String nome, @RequestParam String email, @RequestParam Double salary) {
		User user = new User(nome, email, salary);
		repository.save(user);
		return "Cadastrado com sucesso! Dê um find aí pra conferir!";
	}

	@GetMapping("/search-salary")
	public ResponseEntity<Page<User>> searchBySalary(@RequestParam(defaultValue = "0") Double minSalary,
			@RequestParam(defaultValue = "1000000000") Double maxSalary, Pageable pageable) {
		Page<User> result = repository.findBySalaryBetween(minSalary, maxSalary, pageable);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/search-name")
	public ResponseEntity<Page<User>> searchByName(@RequestParam(defaultValue = "") String name,
			Pageable pageable) {
		Page<User> result = repository.findByNameContainingIgnoreCase(name, pageable);
		return ResponseEntity.ok(result);
	}

}
