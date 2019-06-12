package com.zhiliao.mybatis.enumExt;

public interface TCmsContentEnum {

    /**
     * 文章类型
     */
    enum status {

        success(1, "已发布文章"),
        hold(0, "草稿文章"),
        delete(-1, "已删除文章");

        public final Integer code;

        status(Integer code, String desc) {
            this.code = code;
        }
    }
}