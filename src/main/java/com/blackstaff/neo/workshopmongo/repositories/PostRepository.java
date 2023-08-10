package com.blackstaff.neo.workshopmongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blackstaff.neo.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {
	public List<Post> findByTitleContainingIgnoreCase(String text);
} 