package com.qf.service.impl;

import com.qf.dao.UserMapper;
import com.qf.domain.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/5/23.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectAll() {
        return userMapper .selectAll();
    }

    @Override
    public User selectById(int id) {

        return userMapper.selectById(id);
    }


    @Override
    public void deleteById(int id) {
         userMapper.deleteById(id);

    }
    @Override
    public void updateById(User users) {
       userMapper.updateById(users);

    }
    @Override
    public void insertUser(User users) {
         userMapper.insertUser(users);

    }





}










