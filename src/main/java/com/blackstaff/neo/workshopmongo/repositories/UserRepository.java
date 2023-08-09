package com.blackstaff.neo.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blackstaff.neo.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
}