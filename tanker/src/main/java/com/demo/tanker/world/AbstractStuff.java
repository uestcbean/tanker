package com.demo.tanker.world;

import com.alibaba.fastjson.JSONObject;
import com.demo.tanker.constant.Position;
import com.demo.tanker.domain.StuffDO;

import java.awt.*;

public abstract class AbstractStuff {

    /**
     * 绘制当前物体
     * @param stuffDO
     */
    protected void paint(StuffDO stuffDO){
        return;
    }

    /**
     * 获取当前的位置
     * @param stuffDO
     * @return
     */
    protected Rectangle getPos(StuffDO stuffDO){
        Position current = JSONObject.parseObject(stuffDO.getPosition(), Position.class);
        return current.getPos();
    }

    /**
     * 物品类型
     * @return
     */
    abstract Integer type();
}
