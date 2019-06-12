package com.zhiliao.module.web.cms.service;

import com.github.pagehelper.PageInfo;
import com.zhiliao.common.base.BaseService;
import com.zhiliao.mybatis.model.TExtAdvertise;

public interface AdvertiseService extends BaseService<TExtAdvertise, Long> {
    PageInfo<TExtAdvertise> page(Integer pageNumer, Integer pageSize, String startTime, String endTime);
}
