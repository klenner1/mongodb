package com.javaee.klenner.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javaee.klenner.mongodb.domain.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{

}