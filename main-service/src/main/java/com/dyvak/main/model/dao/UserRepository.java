package com.dyvak.main.model.dao;

import com.dyvak.main.model.entity.impl.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
