package com.blackstaff.neo.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blackstaff.neo.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {
} 