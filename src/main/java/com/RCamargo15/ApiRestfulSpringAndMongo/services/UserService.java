package com.RCamargo15.ApiRestfulSpringAndMongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RCamargo15.ApiRestfulSpringAndMongo.domain.User;
import com.RCamargo15.ApiRestfulSpringAndMongo.repositories.UserRepository;
import com.RCamargo15.ApiRestfulSpringAndMongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
