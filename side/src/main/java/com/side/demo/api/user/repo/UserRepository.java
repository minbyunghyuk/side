package com.side.demo.api.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.side.demo.api.user.model.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

	 UserEntity findByUserId(String userId);
	
}
