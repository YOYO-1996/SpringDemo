package com.tong.controller;

import com.tong.entity.ReData;
import com.tong.entity.User;
import com.tong.service.UserService;
import com.tong.service.serviceImpl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：Tong
 * @date ：Created in 2020/2/17 16:03
 * @description：
 * @version: $
 */
@Controller
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/queryUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public ReData queryUserInfo(String userMobile){
        logger.info(userMobile);
        User user = userService.queryUserInfo(userMobile);
        return ReData.SUCCESS().setData(user);
    }
}
