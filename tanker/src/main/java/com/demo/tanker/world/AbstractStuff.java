package com.demo.tanker.world;

import com.demo.tanker.domain.StuffDO;

public abstract class AbstractStuff {

    /**
     * 绘制当前物体
     * @param stuffDO
     */
    abstract void paint(StuffDO stuffDO);

    /**
     * 物品类型
     * @return
     */
    abstract Integer type();
}
