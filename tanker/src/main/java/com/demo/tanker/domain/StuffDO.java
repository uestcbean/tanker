package com.demo.tanker.domain;

import lombok.Data;

@Data
public class StuffDO {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 图片地址
     */
    private String pic;

    /**
     * 维度 目前只会有二维
     */
    private Integer dimension;

    /**
     * 当前位置
     */
    private String position;

    /**
     * 运动方向
     */
    private Double direction;

    /**
     * 速度
     */
    private Integer speed;

    /**
     * 生命值
     */
    private Integer life;

    /**
     * 物品状态
     */
    private Integer status;
}
