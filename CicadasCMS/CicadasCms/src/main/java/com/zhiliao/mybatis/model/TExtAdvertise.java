package com.zhiliao.mybatis.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_ext_advertise")
public class TExtAdvertise implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    private String name;

    /**
     * 性别：1=男、2=女
     */
    private Integer sex;

    private String mobile;

    private String weixin;

    private String picture;

    /**
     * 删除：0=删除、1=有效
     */
    @Column(name = "gmt_is_del")
    private Integer gmtIsDel;

    @Column(name = "gmt_create_time")
    private Date gmtCreateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别：1=男、2=女
     *
     * @return sex - 性别：1=男、2=女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别：1=男、2=女
     *
     * @param sex 性别：1=男、2=女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return weixin
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * @param weixin
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    /**
     * @return picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @param picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 获取删除：0=删除、1=有效
     *
     * @return gmt_is_del - 删除：0=删除、1=有效
     */
    public Integer getGmtIsDel() {
        return gmtIsDel;
    }

    /**
     * 设置删除：0=删除、1=有效
     *
     * @param gmtIsDel 删除：0=删除、1=有效
     */
    public void setGmtIsDel(Integer gmtIsDel) {
        this.gmtIsDel = gmtIsDel;
    }

    /**
     * @return gmt_create_time
     */
    public Date getGmtCreateTime() {
        return gmtCreateTime;
    }

    /**
     * @param gmtCreateTime
     */
    public void setGmtCreateTime(Date gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
    }
}