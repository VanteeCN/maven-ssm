package cn.rayfoo.core.mapper;

import cn.rayfoo.core.pojo.User;

public interface UserMapper {
    User findOne(Integer uid);
}
