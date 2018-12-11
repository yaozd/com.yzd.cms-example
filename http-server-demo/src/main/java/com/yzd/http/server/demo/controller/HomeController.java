package com.yzd.http.server.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @Value("${server.port}")
    private String serverPort;
    @Value("${server.area}")
    private String serverArea;

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping(value = {"/","/index"})
    @ResponseBody
    public Map<String,Object> index() {
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("server.port",serverPort);
        resultMap.put("server.area",serverArea);
        resultMap.put("timestamp",System.currentTimeMillis());
        return resultMap;
    }
}
