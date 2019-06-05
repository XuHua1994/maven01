package com.fastech.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fastech.dao.UserDao;
import com.fastech.model.User;
import com.fastech.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource  
    private UserDao userDao;  
    
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return userDao.selectByPrimaryKey(userId);
    }  

}
