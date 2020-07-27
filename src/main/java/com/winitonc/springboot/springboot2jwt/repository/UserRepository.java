package com.winitonc.springboot.springboot2jwt.repository;

import com.winitonc.springboot.springboot2jwt.model.dao.UserDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDao, Integer> {

    UserDao findByUsername(String username);

}
