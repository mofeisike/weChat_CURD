package com.wx.demo.util;

import lombok.Data;

/**
 * @author mofeiske
 * @Description: ${todo}
 * @Date: Create in 2019/4/19 18:11
 */

@Data
public class ResponseResult {

    //请求状态
    private boolean success;

    //返回提示信息
    private String msg;

    //返回数据
    private Object data;

    public ResponseResult(boolean success,String msg,Object data){
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult(boolean success,String msg){
        this.success = success;
        this.msg =msg;
    }

    public ResponseResult(boolean success){
        this.success =success;
    }

}
