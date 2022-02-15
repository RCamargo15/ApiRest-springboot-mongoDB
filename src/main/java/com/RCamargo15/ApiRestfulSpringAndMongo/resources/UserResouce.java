package com.RCamargo15.ApiRestfulSpringAndMongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RCamargo15.ApiRestfulSpringAndMongo.domain.User;
import com.RCamargo15.ApiRestfulSpringAndMongo.dto.UserDTO;
import com.RCamargo15.ApiRestfulSpringAndMongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {

	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> findAll(){
		
		List<User> list = service.findAll();
		List<UserDTO> listDTO = list.stream().map(o -> new UserDTO(o)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
}
