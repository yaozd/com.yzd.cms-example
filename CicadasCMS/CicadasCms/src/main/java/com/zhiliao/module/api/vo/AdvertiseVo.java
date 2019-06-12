package com.zhiliao.module.api.vo;
import java.util.Date;

import com.zhiliao.mybatis.enumExt.TbPublicEnum;
import com.zhiliao.mybatis.model.TExtAdvertise;

public class AdvertiseVo {

    private String name;

    private Integer sex;

    private String mobile;

    private String weixin;

    private String picture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 性别：1=男、2=女
     */
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public static TExtAdvertise toEntity(AdvertiseVo form) {
        TExtAdvertise tExtAdvertise = new TExtAdvertise();
        tExtAdvertise.setName(form.getName());
        tExtAdvertise.setSex(form.getSex());
        tExtAdvertise.setMobile(form.getMobile());
        tExtAdvertise.setWeixin(form.getWeixin());
        tExtAdvertise.setPicture(form.getPicture());
        tExtAdvertise.setGmtIsDel(TbPublicEnum.gmdIsDel.NO.getCode());
        tExtAdvertise.setGmtCreateTime(new Date());
        return tExtAdvertise;
    }
}
