package com.example.hhh.service;

import com.example.hhh.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2019/4/20.
 */

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id );

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAllUser();
}
