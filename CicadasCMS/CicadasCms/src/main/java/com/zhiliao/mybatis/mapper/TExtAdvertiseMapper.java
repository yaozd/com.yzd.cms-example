package com.zhiliao.mybatis.mapper;

import com.zhiliao.mybatis.model.TExtAdvertise;
import com.zhiliao.mybatis.model.TSysLog;
import com.zhiliao.mybatis.where.TExtAdvertiseWhere;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TExtAdvertiseMapper extends Mapper<TExtAdvertise> {
    List<TExtAdvertise> selectList(@Param("pojo") TExtAdvertise pojo,@Param("extendWhere") TExtAdvertiseWhere extendWhere);
}