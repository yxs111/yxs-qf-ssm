package com.qf.dao;

import com.qf.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2019/5/23.
 */
public interface UserMapper {
    List<User> selectAll();
    User selectById(int id);
    void deleteById(int id);
    void updateById(User users);
    void insertUser(User users);


}
