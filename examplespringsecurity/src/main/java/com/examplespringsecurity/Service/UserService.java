package com.examplespringsecurity.Service;

import java.util.List;
import java.util.Optional;

import com.examplespringsecurity.entity.Tb_User;

public interface UserService {

	public String create(Tb_User user);

	public Optional<Tb_User> getData(Integer id);
	
	List<Tb_User> getDataAll();
	
	public String deleteData(Integer id);
}
