package com.yzd.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 模板控制器
 */
@Slf4j
@Controller
public class TemplateController {
    /**
     * 新闻模板==首页
     * @return
     */
    @RequestMapping("new")
    public String newIndex() {
        return "new/index";
    }

    /**
     * 新闻模板==详情
     * @return
     */
    @RequestMapping("new/detail")
    public String newDetail() {
        return "new/detail";
    }
}
