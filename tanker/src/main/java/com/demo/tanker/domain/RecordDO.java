package com.demo.tanker.domain;

import lombok.Data;

@Data
public class RecordDO {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 玩家id
     */
    private Long playerId;

    /**
     * 战场id
     */
    private Long battlefield_id;

    /**
     * 记录状态
     */
    private Integer status;
}
