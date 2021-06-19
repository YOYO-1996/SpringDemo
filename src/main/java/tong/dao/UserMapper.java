package tong.dao;

import org.apache.ibatis.annotations.Param;
import tong.entity.User;


public interface UserMapper {

    User queryUserInfo(@Param("userMobile") String userMobile);
}
