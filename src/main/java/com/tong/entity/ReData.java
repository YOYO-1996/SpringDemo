package com.tong.entity;

/**
 * @author ：Tong
 * @date ：Created in 2020/2/17 16:08
 * @description： 返回统一信息
 * @version: $
 */
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

    public ReData() {
    }

    public ReData(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public ReData setData(Object data) {
        this.data = data;
        return this;
    }
}
