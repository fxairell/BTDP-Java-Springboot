package com.belajar.spring;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.model.Address;
import com.belajar.spring.model.User;
import com.belajar.spring.repository.AddressRepository;
import com.belajar.spring.repository.UserRepository;

@SpringBootApplication
public class LatihanSpringJpaApplication implements CommandLineRunner {
	private final Logger LOG = LoggerFactory.getLogger(LatihanSpringJpaApplication.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(LatihanSpringJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// Menambahkan user ke database
		User user1 = new User("ichigo@tokyomewmew.cafe", "Momomiya Ichigo", "mewichigo");
		User user2 = new User("mint@tokyomewmew.cafe", "Mint Aizawa", "mewmint");
		// Save user ke database
		userRepository.saveAll(Arrays.asList(user1, user2));

		// Menambahkan address ke database
		Address address1 = new Address("Tokyo", "Japan", "Tokyo", "Mew Mew Cafe", "405405", user1);
		Address address2 = new Address("Tokyo", "Japan", "Tokyo", "Mew Mew Cafe", "405405", user2);
		// Save course ke database
		addressRepository.saveAll(Arrays.asList(address1, address2));
	}
}
