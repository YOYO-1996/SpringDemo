package tong.entity;

import lombok.Data;


/**
 * @author ：Tong
 * @date ：Created in 2020/2/17 16:08
 * @description： 返回统一信息
 * @version: $
 */
@Data
public class ReData {
    public String code;

    public String msg;

    public Object data;

    public static final String defaultSuccessCode = "DEF000";

    public static final String defaultSuccessMsg = "成功";

    public static final String defaultFailCode = "DEF001";

    public static final String defaultFailMsg = "失败";

    public static ReData SUCCESS() {
        return new ReData(defaultSuccessCode, defaultSuccessMsg);
    }

    public static ReData FAIL() {
        return new ReData(defaultFailCode, defaultFailMsg);
    }

    public ReData(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ReData setData(Object data) {
        this.data = data;
        return this;
    }
}
