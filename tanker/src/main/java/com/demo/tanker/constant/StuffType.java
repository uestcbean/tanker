package com.demo.tanker.constant;

import lombok.Getter;

@Getter
public enum StuffType {

    TANK(0, "坦克"),

    BOT(1, "敌人"),

    WOOD(2, "木板"),

    WATER(3, "水"),

    STEEL(4, "铁板"),

    BULLET(5, "子弹"),

    GUN(6, "奖品-枪"),

    STAR(7, "星星-枪")

    ;


    private Integer code;

    private String name;

    private StuffType(Integer code, String name){
        this.code = code;
        this.name = name;
    }
}
