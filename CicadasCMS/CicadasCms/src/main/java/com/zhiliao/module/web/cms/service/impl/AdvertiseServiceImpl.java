package com.zhiliao.module.web.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiliao.common.utils.DateUtil;
import com.zhiliao.common.utils.JsonUtil;
import com.zhiliao.common.utils.OptionalUtil2;
import com.zhiliao.common.utils.StrUtil;
import com.zhiliao.module.web.cms.service.AdvertiseService;
import com.zhiliao.mybatis.enumExt.TbPublicEnum;
import com.zhiliao.mybatis.mapper.TExtAdvertiseMapper;
import com.zhiliao.mybatis.model.TExtAdvertise;
import com.zhiliao.mybatis.where.TExtAdvertiseWhere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdvertiseServiceImpl implements AdvertiseService {
    @Autowired
    private TExtAdvertiseMapper advertiseMapper;
    @Override
    public String save(TExtAdvertise pojo) {
        advertiseMapper.insertSelective(pojo);
        return JsonUtil.toSUCCESS("添加成功！","advertise-tab",true);
    }

    @Override
    public String update(TExtAdvertise pojo) {
        return null;
    }

    @Override
    public String delete(Long[] ids) {
        return null;
    }

    @Override
    public TExtAdvertise findById(Long id) {
        return null;
    }

    @Override
    public List<TExtAdvertise> findList(TExtAdvertise pojo) {
        return null;
    }

    @Override
    public List<TExtAdvertise> findAll() {
        return null;
    }

    @Override
    public PageInfo<TExtAdvertise> page(Integer pageNumber, Integer pageSize, TExtAdvertise pojo) {
        return null;
    }

    @Override
    public PageInfo<TExtAdvertise> page(Integer pageNumber, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo<TExtAdvertise> page(Integer pageNumer, Integer pageSize, String startTime, String endTime) {
        PageHelper.startPage(pageNumer,pageSize);
        TExtAdvertise item=new TExtAdvertise();
        item.setGmtIsDel(TbPublicEnum.gmdIsDel.NO.getCode());
        TExtAdvertiseWhere where=new TExtAdvertiseWhere();
        if(!StrUtil.isBlank(startTime)){
            where.setGmtCreateTime4Start(DateUtil.parseDate(startTime));
        }
        if(!StrUtil.isBlank(endTime)){
            where.setGmtCreateTime4Start(DateUtil.parseDate(endTime));
        }
        return new PageInfo<>(advertiseMapper.selectList(item,where));
    }
}
