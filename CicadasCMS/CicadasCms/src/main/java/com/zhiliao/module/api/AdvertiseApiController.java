package com.zhiliao.module.api;

import com.zhiliao.common.utils.JsonUtil;
import com.zhiliao.module.api.vo.AdvertiseVo;
import com.zhiliao.module.web.cms.service.AdvertiseService;
import com.zhiliao.mybatis.model.TExtAdvertise;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/advertise")
public class AdvertiseApiController {
    @Autowired
    AdvertiseService advertiseService;

    @ApiOperation("招聘保存接口")
    @PostMapping("/save")
    @ResponseBody
    public String save(AdvertiseVo form) {
        TExtAdvertise item = AdvertiseVo.toEntity(form);
        advertiseService.save(item);
        return JsonUtil.toSuccessResultJSON("请求成功", null);
    }
}
