package com.wx.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mofeiske
 * @Description: ${todo}
 * @Date: Create in 2019/4/19 17:06
 */

@RestController
public class hello {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello string";
    }


}
