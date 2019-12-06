package cn.rayfoo.core.service.impl;

import cn.rayfoo.core.mapper.UserMapper;
import cn.rayfoo.core.pojo.User;
import cn.rayfoo.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User findOne(Integer uid) {
        return userMapper.findOne(uid);
    }
}
