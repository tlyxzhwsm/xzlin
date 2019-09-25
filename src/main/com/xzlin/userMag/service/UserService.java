package com.xzlin.userMag.service;

import com.xzlin.userMag.dao.IUserDao;
import com.xzlin.userMag.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserService {
@Resource
    private IUserDao ud;

public List<User> getUsers(){
    System.out.println("user--"+ud);
    return  ud.getUsers();
}

}
