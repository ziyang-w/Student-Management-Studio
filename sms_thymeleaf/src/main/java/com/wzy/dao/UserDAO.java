package com.wzy.dao;

import com.wzy.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {

    void save(User user);
    User login(@Param("username") String username,@Param("password") String password);
}
