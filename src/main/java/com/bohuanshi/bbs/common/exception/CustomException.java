package com.bohuanshi.bbs.common.exception;

/**
 * @Author: bohuanshi
 * @Date: 2020/9/27 18:48
 * @Description:
 */

import com.bohuanshi.bbs.common.model.ResultCode;

/**
 * 之所以继承RuntimeException是因为对代码没有侵入型
 * 可以查一下throw exception和throw runtimeexception的区别
 */
public class CustomException extends RuntimeException {
    ResultCode resultCode;

    public CustomException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
