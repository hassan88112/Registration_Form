package com.global.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.global.Entity.User;

@Repository
public interface UserRepos extends JpaRepository<User, Long>{

}
