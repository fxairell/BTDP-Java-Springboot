package com.example.BelajarAPISQL.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.BelajarAPISQL.model.User;
import com.example.BelajarAPISQL.service.UserService;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {
    @Autowired
	UserService userService;

	@CrossOrigin
	@GetMapping("/users")
	public List<User> list() {
		return userService.listAllUser();
	}

	@CrossOrigin
	@GetMapping("/users/{id}")
	public ResponseEntity<User> users(@PathVariable Integer id) {
		try {
			User user = userService.getUser(id);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@PostMapping("/users")
	public ResponseEntity<?> users(@RequestBody User user) {
		userService.saveUser(user);
		return new ResponseEntity<>("Berhasil hapus data produk.", HttpStatus.OK);
	}

	@CrossOrigin
	@PutMapping("/users/{id}")
	public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) {
		try {
			User existUser = userService.getUser(id);
			if (existUser.getId() != id) {
				return new ResponseEntity<>("ID Tidak Ada !!",HttpStatus.OK);
			}
			user.setId(id);
			userService.saveUser(user);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@DeleteMapping("/users/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		userService.deleteUser(id);
		return new ResponseEntity<>("Berhasil hapus data produk.", HttpStatus.OK);
	}
}