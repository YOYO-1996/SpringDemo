package login;

import com.alibaba.fastjson.JSON;
import com.tong.controller.UserController;
import com.tong.entity.ReData;
import com.tong.entity.User;
import com.tong.service.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ：Tong
 * @date ：Created in 2020/2/17 17:15
 * @description：
 * @version: $
 */

public class userTest {
    @Autowired
    UserService userService;
    Logger logger = LoggerFactory.getLogger(userTest.class);
    @Test
    public void queryUserInfo(){
        User user  = userService.queryUserInfo("18860902757");
        logger.info(user.toString());
    }
}
