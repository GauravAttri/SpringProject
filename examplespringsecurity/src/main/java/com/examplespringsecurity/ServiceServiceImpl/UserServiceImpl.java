package com.examplespringsecurity.ServiceServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplespringsecurity.Repository.UserRepository;
import com.examplespringsecurity.Service.UserService;
import com.examplespringsecurity.entity.Tb_User;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public String create(Tb_User user) {
		
		userRepository.save(user);
		return "Save Successfully!!!!";
	}
	@Override
	public Optional<Tb_User> getData(Integer id) {
		System.out.println(id);
		return userRepository.findById(id);
	}
	@Override
	public List<Tb_User> getDataAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	@Override
	public String deleteData(Integer id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		userRepository.deleteById(id);
		return "Deleted!!!";
		
	}


}
