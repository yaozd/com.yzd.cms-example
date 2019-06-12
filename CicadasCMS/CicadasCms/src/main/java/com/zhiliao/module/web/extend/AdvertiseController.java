package com.zhiliao.module.web.extend;

import com.zhiliao.common.utils.OptionalUtil2;
import com.zhiliao.module.web.cms.service.AdvertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/extend/advertise")
public class AdvertiseController {

    @Autowired
    AdvertiseService advertiseService;
    /**
     *
     * 自定义扩展招聘
     * @return
     */
    @RequestMapping
    public ModelAndView index(@RequestParam(value = "pageCurrent",defaultValue = "1") Integer pageNumber,
                              @RequestParam(value = "pageSize",defaultValue = "50") Integer pageSize,
                              @RequestParam(value="startTime",defaultValue = "") String startTime,
                              @RequestParam(value = "endTime",defaultValue = "") String endTime){
        ModelAndView view = new ModelAndView("extend/advertise");
        view.addObject("model",advertiseService.page(pageNumber,pageSize, startTime,endTime));
        view.addObject("startTime",startTime);
        view.addObject("endTime",endTime);
        return view;
    }

}
