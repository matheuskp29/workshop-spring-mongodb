package com.matheuskaczan.workshopmongo.repository;

import com.matheuskaczan.workshopmongo.entities.Post;
import com.matheuskaczan.workshopmongo.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> { }
