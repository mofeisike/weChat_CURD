package com.wx.demo.handler;

import com.wx.demo.util.FormatResponseUtil;
import com.wx.demo.util.ResponseResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created By Cx On 2018/5/3 13:13
 */
//@RestControllerAdvice = @ControllerAdvice + @ResponseBody
@ControllerAdvice
public class ExceptionHandle {

    //只做了一个,一个统一的异常处理, 方便处理所有异常
    @ResponseBody
    @ExceptionHandler(Exception.class)
    private ResponseResult exceptionHandle(Exception e){
        return FormatResponseUtil.error(e);
    }
}
