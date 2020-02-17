package com.tong.service;

import com.tong.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User queryUserInfo(String userMobile);
}
