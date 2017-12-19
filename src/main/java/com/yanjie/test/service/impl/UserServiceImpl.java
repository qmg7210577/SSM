package com.yanjie.test.service.impl;

import com.yanjie.test.dto.User;
import com.yanjie.test.mapper.UserMapper;
import com.yanjie.test.service.IUserService;
import com.yanjie.test.util.Message;
import com.yanjie.test.util.MessageState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/23.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    public Message login(String username, String password) {
        if (username == null || password == null) {
            return new Message(MessageState.error, "input error", null);
        }
        User user = userMapper.getUserByUsername(username);
        if (user.getPassword().equals(password)) {
            return new Message(MessageState.success, "login is right", user);
        } else {
            return new Message(MessageState.fail, "password is worng", null);
        }
    }

    public Message register(User user) {
        return null;
    }
}
