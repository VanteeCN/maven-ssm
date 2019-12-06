package cn.rayfoo.core.controller;

import cn.rayfoo.core.pojo.User;
import cn.rayfoo.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findOne")
    public User findOne(Integer uid){
        return userService.findOne(uid);
    }

}
