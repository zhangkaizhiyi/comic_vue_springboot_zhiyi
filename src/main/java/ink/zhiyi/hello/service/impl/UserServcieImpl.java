package ink.zhiyi.hello.service.impl;

import ink.zhiyi.hello.domain.User;

import ink.zhiyi.hello.mapper.UserMapper;
import ink.zhiyi.hello.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("userService")
public class UserServcieImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Integer id) {
        User user = userMapper.findById(id);
        return user;
    }
}
