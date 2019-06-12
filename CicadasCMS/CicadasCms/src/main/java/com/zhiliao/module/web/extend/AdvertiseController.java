package com.zhiliao.module.web.extend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/extend/advertise")
public class AdvertiseController {


    /**
     *
     * 自定义扩展招聘
     * @param model
     * @return
     */
    @RequestMapping
    public String index(Model model) {
        return "extend/advertise";
    }
}
