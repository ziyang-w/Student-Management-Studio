package com.wzy.service;

import com.wzy.entity.User;

public interface UserService {
    User login(String username,String password);
}
