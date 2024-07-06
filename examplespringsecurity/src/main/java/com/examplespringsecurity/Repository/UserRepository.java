package com.examplespringsecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examplespringsecurity.entity.Tb_User;
@Repository
public interface UserRepository extends JpaRepository<Tb_User, Integer>{

}
