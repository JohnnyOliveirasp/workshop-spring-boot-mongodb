package com.teste.workshopmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.workshopmongodb.domain.Post;
import com.teste.workshopmongodb.repository.PostRepository;
import com.teste.workshopmongodb.services.exception.ObjectNotFoundException;


@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}