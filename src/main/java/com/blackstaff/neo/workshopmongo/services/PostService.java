package com.blackstaff.neo.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackstaff.neo.workshopmongo.domain.Post;
import com.blackstaff.neo.workshopmongo.repositories.PostRepository;
import com.blackstaff.neo.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text) {
		List<Post> posts = repo.findByTitleContainingIgnoreCase(text);
		return posts;
	}
}