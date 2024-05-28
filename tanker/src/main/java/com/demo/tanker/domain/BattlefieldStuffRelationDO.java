package com.demo.tanker.domain;

import lombok.Data;

@Data
public class BattlefieldStuffRelationDO {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 战场id
     */
    private Long battlefield_id;

    /**
     * 物品id
     */
    private Long stuff_id;
}
