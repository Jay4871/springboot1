package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jay.wang
 * @create 2019-07-31-10:47
 **/
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/helloworld")
    public String helloworld()
    {
      return "helloworld";
    }
}
