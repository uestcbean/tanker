package com.demo.tanker.manager;

import com.demo.tanker.domain.BattlefieldDO;
import com.demo.tanker.domain.StuffDO;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BattlefieldManager {

    /**
     * 根据战场id获取所有的元素
     * @return
     */
    public List<StuffDO> getAllStuffDOByBattlefieldId(Long battlefieldId){
        return Lists.newArrayList();
    }

    /**
     * 获取战场对象
     * @param battlefieldId
     * @return
     */
    public BattlefieldDO getBattlefieldDO(Long battlefieldId){
        return new BattlefieldDO();
    }
}
