package com.yzd.httpServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zd.yao on 2017/11/22.
 */
@RestController
@RequestMapping("test")
public class _TestController {
    @RequestMapping("t1")
    public  String t1(){
        return "t1 page is ok!";
    }
}
