package com.examplespringsecurity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examplespringsecurity.Service.UserService;
import com.examplespringsecurity.entity.Tb_User;

@RestController
public class Basic_crud {

	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public String createData(@RequestBody Tb_User user) {
		return userService.create(user);
		
	}
	
	@GetMapping("/getData")
	public Optional<Tb_User> getData(@RequestParam Integer id) {
		return userService.getData(id);
		
	}
	
	@GetMapping("/getAllData")
	public List<Tb_User> getAllData(){
		return userService.getDataAll();
		
	}
	
	@DeleteMapping("/deleteData")
	public String deleteData(@PathVariable Integer id) {
		return userService.deleteData(id);
	}
	
	
}
