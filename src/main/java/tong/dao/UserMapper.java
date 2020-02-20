package tong.dao;

import org.apache.ibatis.annotations.Mapper;
import tong.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User queryUserInfo(@Param("userMobile") String userMobile);
}
