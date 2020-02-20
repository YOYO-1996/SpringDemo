package tong.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @author ：Tong
 * @date ：Created in 2020/2/17 9:32
 * @description：
 * @version: $
 */
@Data
public class User {
    private String userId;

    private String userName;

    private String accountPwd;

    private String userMobile;

    private String userStt;

    private String userRole;
}
