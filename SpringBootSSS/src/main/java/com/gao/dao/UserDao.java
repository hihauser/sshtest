package com.gao.dao;

import com.gao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserDao extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {

}
