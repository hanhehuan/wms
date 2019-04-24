package com.example.hhh.service.impl;
import com.example.hhh.dao.UserMapper;
import com.example.hhh.model.User;
import com.example.hhh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2019/4/20.
 */
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Transactional
    @Override
    public int deleteByPrimaryKey(Integer id) {

        return userMapper.deleteByPrimaryKey(id);
    }
    @Transactional
    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }
    @Transactional
    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }
    @Transactional
    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
    @Transactional
    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<User> selectAllUser() {
        return null;
    }
}
