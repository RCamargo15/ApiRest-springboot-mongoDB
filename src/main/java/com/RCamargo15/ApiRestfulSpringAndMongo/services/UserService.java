package com.RCamargo15.ApiRestfulSpringAndMongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RCamargo15.ApiRestfulSpringAndMongo.domain.User;
import com.RCamargo15.ApiRestfulSpringAndMongo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
}
