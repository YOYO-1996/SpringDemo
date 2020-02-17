package com.tong.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：Tong
 * @date ：Created in 2020/2/16 19:40
 * @description：测试控制器
 * @version: $
 */
@RequestMapping("/test")
@Controller
public class TestController {
    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/first")
    public String firstTest(){
        logger.info("first");
        return "first";
    }
}
