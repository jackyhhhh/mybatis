package com.tarena.dao;

import com.tarena.entity.Page;
import com.tarena.entity.User;

import java.util.List;

public interface UserMapperDao {
    public List<User> findAll();
    public User findById(int id);
    public int updateUser(User user);
    public int deleteUserById(int id);
    public int addUser(User user);
    public List<User> findPage(Page page);
}
