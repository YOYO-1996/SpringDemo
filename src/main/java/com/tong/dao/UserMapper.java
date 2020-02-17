package com.tong.dao;

import com.tong.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    User queryUserInfo(@Param("userMobile") String userMobile);
}
