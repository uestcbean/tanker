package com.demo.tanker.constant;

import java.awt.*;

/**
 * 位置
 */
public class Position {

    /**
     * 左上的x坐标
     */
    private Integer x;

    /**
     * 左上的y坐标
     */
    private Integer y;

    /**
     * 宽度
     */
    private Integer width;

    /**
     * 长度
     */
    private Integer length;

    /**
     * 获取坐标位置
     * @return
     */
    public Rectangle getPos(){
        return new Rectangle(this.x, this.y, this.width, this.length);
    }
}
