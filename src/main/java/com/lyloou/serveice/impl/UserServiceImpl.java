package com.lyloou.serveice.impl;

import com.lyloou.mapping.UserMapper;
import com.lyloou.pojo.User;
import com.lyloou.serveice.IUserService;
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