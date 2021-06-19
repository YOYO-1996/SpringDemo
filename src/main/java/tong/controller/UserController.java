package tong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import lombok.extern.slf4j.Slf4j;
import tong.entity.ReData;
import tong.entity.User;
import tong.service.UserService;


/**
 * @author ：Tong
 * @date ：Created in 2020/2/17 16:03
 * @description：
 * @version: $
 */
@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/queryUserInfo", method = RequestMethod.POST)
    @ResponseBody
    public ReData queryUserInfo(String userMobile) {
        User user = userService.queryUserInfo(userMobile);
        log.info(user.toString());
        return ReData.SUCCESS().setData(user);
    }

}
