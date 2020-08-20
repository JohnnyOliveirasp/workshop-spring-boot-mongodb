package com.teste.workshopmongodb.resources;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teste.workshopmongodb.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	//@GetMapping ou 
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		
		User maria = new User("1", "Maria da Silva", "maria@gmail.com");
		User jose = new User("2", "Jose da Silva", "jose@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, jose));
		
		return  ResponseEntity.ok().body(list);
		
	}

}
