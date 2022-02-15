package com.RCamargo15.ApiRestfulSpringAndMongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.RCamargo15.ApiRestfulSpringAndMongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
