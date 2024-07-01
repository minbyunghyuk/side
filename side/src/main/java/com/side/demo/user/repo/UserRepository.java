package com.side.demo.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.side.demo.user.model.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long >{

	
	
}
