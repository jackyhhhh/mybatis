package com.tarena.dao;

import com.tarena.entity.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public void deleteUserById(int id);
    public void updateUser(User user);
    public User findById(int id);
    public List<User> findAll();
}
