package com.tarena.dao.impl;

import com.tarena.dao.UserDao;
import com.tarena.entity.User;
import com.tarena.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {
    public void addUser(User user) {
        SqlSession session = SqlSessionUtil.getSession();
        session.insert("addUser", user);
        session.commit(); //增删改 操作需要commit
        session.close();
    }

    public void deleteUserById(int id){
        SqlSession session = SqlSessionUtil.getSession();
        session.delete("deleteUserById", id);
        session.commit(); //增删改 操作需要commit
        session.close();
    }

    public void updateUser(User user){
        SqlSession session = SqlSessionUtil.getSession();
        session.update("updateUser", user);
        session.commit(); //增删改 操作需要commit
        session.close();
    }

    public User findById(int id){
        SqlSession session = SqlSessionUtil.getSession();
        User user = session.selectOne("findById", id);
        session.close();
        return user;
    }

    public List<User> findAll(){
        SqlSession session = SqlSessionUtil.getSession();
        List<User> list = session.selectList("findAll");
        session.close();
        return list;
    }

}
