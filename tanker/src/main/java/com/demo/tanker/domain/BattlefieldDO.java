package com.demo.tanker.domain;

import lombok.Data;

@Data
public class BattlefieldDO {

    /**
     *主键id
     */
    private Long id;

    /**
     * 1-模板 2-实例
     */
    private Integer type;

    /**
     * 关卡等级
     */
    private Integer level;

    /**
     * 作者
     */
    private String creator;

    /**
     * 维度 目前只会有二维
     */
    private Integer dimension;

    /**
     * 窗口大小
     */
    private String size;

    /**
     * 状态
     */
    private Integer status;
}
