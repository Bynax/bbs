package com.bohuanshi.bbs.common.exception;

import com.bohuanshi.bbs.common.model.ResultCode;

/**
 * @Author: bohuanshi
 * @Date: 2020/9/27 18:54
 * @Description:
 */

public class ExceptionCast {

    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }

}
