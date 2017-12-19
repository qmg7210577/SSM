package com.yanjie.test.controller;

import com.yanjie.test.service.IUserService;
import com.yanjie.test.util.Message;
import com.yanjie.test.util.MessageState;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/8/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public ModelAndView  login(HttpServletRequest request, String username, String password)
    {

        System.out.println(username+password);
        Message msg =  userService.login(username,password);
        if(msg.getState().equals(MessageState.success))
        {
            return new ModelAndView(request.getContextPath()+"success.jsp");
        }
        return null;
    }

}
