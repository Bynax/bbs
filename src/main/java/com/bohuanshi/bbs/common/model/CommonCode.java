package com.bohuanshi.bbs.common.model;

/**
 * @Author: bohuanshi
 * @Date: 2020/9/27 19:09
 * @Description:
 */

public enum CommonCode implements ResultCode {
    INVALIED_PARA(401, "无效参数"),
    INTERNAL_ERROR(500, "服务器内部错误");


    private int code;
    private String message;

    CommonCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
