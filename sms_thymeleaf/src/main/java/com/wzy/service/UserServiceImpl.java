package com.wzy.service;

import com.wzy.dao.UserDAO;
import com.wzy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public User login(String username, String password) {
        return userDAO.login(username,password);
    }
}
