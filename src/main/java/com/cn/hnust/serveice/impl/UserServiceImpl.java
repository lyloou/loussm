package com.cn.hnust.serveice.impl;

import com.cn.hnust.mapping.UserMapper;
import com.cn.hnust.pojo.User;
import com.cn.hnust.serveice.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;

    @Override
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

}