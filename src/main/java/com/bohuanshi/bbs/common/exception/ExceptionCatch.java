package com.bohuanshi.bbs.common.exception;

import com.bohuanshi.bbs.common.model.CommonCode;
import com.bohuanshi.bbs.common.model.ResponseResult;
import com.bohuanshi.bbs.common.model.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: bohuanshi
 * @Date: 2020/9/27 18:55
 * @Description:
 */

@ControllerAdvice
public class ExceptionCatch {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionCatch.class);

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public ResponseResult customException(CustomException customException) {

        LOGGER.error("Catch Exception:{}", customException.getMessage());

        ResultCode code = customException.getResultCode();
        return new ResponseResult(code);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseResult unexpectedException(Exception e) {

        LOGGER.error("Catch Exception:{}", e.getMessage());

        ResultCode code = CommonCode.INTERNAL_ERROR;
        return new ResponseResult(code);
    }


}
