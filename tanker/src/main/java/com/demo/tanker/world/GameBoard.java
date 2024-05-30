package com.demo.tanker.world;

import com.demo.tanker.domain.BattlefieldDO;
import com.demo.tanker.domain.StuffDO;
import com.demo.tanker.manager.BattlefieldManager;
import com.demo.tanker.util.CodeUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.swing.*;
import java.util.List;

@Component
public class GameBoard extends JFrame {

    @Resource
    private BattlefieldManager battlefieldManager;

    private static final GameBoard instance = new GameBoard();

    private GameBoard(){}

    public static GameBoard getBoardInstance(){
        return instance;
    }

    /**
     * 绘制战场
     * @param battlefieldId
     */
    public void paint(Long battlefieldId) throws Exception {
        BattlefieldDO battlefieldDO = battlefieldManager.getBattlefieldDO(battlefieldId);
        CodeUtil.checkNotNull(battlefieldDO, String.format("战场对象[%s]为空", battlefieldId));
        List<StuffDO> allStuff = battlefieldManager.getAllStuffDOByBattlefieldId(battlefieldId);
        if (CollectionUtils.isEmpty(allStuff)){
            throw new Exception(String.format("战场[%s]元素为空", battlefieldId));
        }
        allStuff.parallelStream().forEach(elem->
            StuffFactory.instance.paintSelf(elem)
        );
    }

}
