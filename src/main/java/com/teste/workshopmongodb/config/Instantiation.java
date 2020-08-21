package com.teste.workshopmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.teste.workshopmongodb.domain.User;
import com.teste.workshopmongodb.repository.UserRepository;

@Configuration
public class Instantiation  implements CommandLineRunner{

	@Autowired
	private UserRepository	userRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown dois", "maria@gmail.com");
		User alex = new User(null, "Alex Green dois", "alex@gmail.com");
		User bob = new User(null, "Bob Grey dois", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		
	}

}
