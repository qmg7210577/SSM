package com.yanjie.test.service;

import com.yanjie.test.dto.User;
import com.yanjie.test.util.Message;

/**
 * Created by Administrator on 2017/8/23.
 */
public interface IUserService {
    public Message login(String username,String password);
    public Message register(User user);
}
