package com.zhiliao.mybatis.enumExt;

/**
 * 数据库所有表中的公共枚举集合
 */
public interface TbPublicEnum {
    /**
     * 删除：0=删除、1=有效
     */
    enum gmdIsDel {
        NO(1, "有效"),
        YES(0, "已删除");

        private final Integer code;

        gmdIsDel(Integer code, String desc) {
            this.code = code;
        }

        public Integer getCode() {
            return this.code;
        }
    }
}
