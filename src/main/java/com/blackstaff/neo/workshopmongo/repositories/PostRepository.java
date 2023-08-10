package com.blackstaff.neo.workshopmongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.blackstaff.neo.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

	public List<Post> findByTitleContainingIgnoreCase(String text);

	@Query("{'title' : { $regex: ?0, $options: 'i'} }")
	public List<Post> findByTitle(String text);
	
} 