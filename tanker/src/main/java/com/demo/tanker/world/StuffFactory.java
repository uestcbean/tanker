package com.demo.tanker.world;

import com.demo.tanker.domain.StuffDO;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class StuffFactory implements InitializingBean {

    public static StuffFactory instance;


    private Map<Integer, AbstractStuff> stuffMap;

    /**
     * 加载元素
     * @param stuffDO
     */
    public void paintSelf(StuffDO stuffDO){
        stuffMap.get(stuffDO.getType()).paint(stuffDO);
    }

    @Autowired
    public void setStuffMap(List<AbstractStuff> stuffList){
        this.stuffMap = stuffList.stream().collect(Collectors.toMap(AbstractStuff::type, Function.identity(), (k1,k2)->k1));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        instance = this;
    }
}
