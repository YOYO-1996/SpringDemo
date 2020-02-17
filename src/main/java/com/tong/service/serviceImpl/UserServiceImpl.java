package com.tong.service.serviceImpl;

import com.tong.dao.UserMapper;
import com.tong.entity.User;
import com.tong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：Tong
 * @date ：Created in 2020/2/17 16:04
 * @description：
 * @version: $
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User queryUserInfo(String userMobile) {
        return userMapper.queryUserInfo(userMobile);
    }
}
