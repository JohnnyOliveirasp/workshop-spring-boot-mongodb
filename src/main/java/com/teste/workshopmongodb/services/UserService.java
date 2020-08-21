package com.teste.workshopmongodb.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.workshopmongodb.domain.User;
import com.teste.workshopmongodb.dto.UserDTO;
import com.teste.workshopmongodb.repository.UserRepository;
import com.teste.workshopmongodb.services.exception.ObjectNotFoundException;


@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}

	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}