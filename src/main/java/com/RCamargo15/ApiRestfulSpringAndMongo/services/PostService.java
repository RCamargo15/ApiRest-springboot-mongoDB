package com.RCamargo15.ApiRestfulSpringAndMongo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RCamargo15.ApiRestfulSpringAndMongo.domain.Post;
import com.RCamargo15.ApiRestfulSpringAndMongo.repositories.PostRepository;
import com.RCamargo15.ApiRestfulSpringAndMongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
	}
	
	public List<Post> findByTitle(String title){
		return repository.findByTitle(title);
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate){
		maxDate = new Date(maxDate.getTime() + 24 *60*60*1000); //Macete para pegar a 00h do proximo dia
		return repository.fullSearch(text, minDate, maxDate);
	}
}
