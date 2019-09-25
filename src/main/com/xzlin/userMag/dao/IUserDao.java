package com.xzlin.userMag.dao;

import com.xzlin.userMag.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {
     List<User> getUsers();
}
