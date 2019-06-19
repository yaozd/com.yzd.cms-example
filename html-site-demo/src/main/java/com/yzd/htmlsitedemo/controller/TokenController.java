package com.yzd.htmlsitedemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
@RequestMapping("token")
public class TokenController {

    /**
     * 非登录情况下的TOKEN设置问题
     *
     * @param response
     * @return
     */
    @GetMapping("nologin")
    @ResponseBody
    public String noLogin(HttpServletResponse response) {
        String token = "no-login-token";
        response.setHeader("Authorization", token);
        response.setHeader("Access-Control-Expose-Headers", "Authorization");
        return token;
    }

}
