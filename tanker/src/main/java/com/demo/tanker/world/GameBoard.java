package com.demo.tanker.world;

import com.alibaba.fastjson2.JSON;
import com.demo.tanker.constant.PanelSize;
import com.demo.tanker.domain.BattlefieldDO;
import com.demo.tanker.domain.StuffDO;
import com.demo.tanker.manager.BattlefieldManager;
import com.demo.tanker.util.CodeUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.swing.*;
import java.awt.*;
import java.util.List;

@Component
public class GameBoard extends JFrame {

    private static Image mainImage = null;

    @Resource
    private BattlefieldManager battlefieldManager;

    @Override
    public void paint(Graphics g){
        g.drawImage(mainImage, 0, 0, null);
    }

    /**
     * 绘制战场
     * @param battlefieldId
     */
    public void createBattlefield(Long battlefieldId) throws Exception {
        BattlefieldDO battlefieldDO = battlefieldManager.getBattlefieldDO(battlefieldId);
        CodeUtil.checkNotNull(battlefieldDO, String.format("战场对象[%s]为空", battlefieldId));
        PanelSize size = JSON.parseObject(battlefieldDO.getSize(), PanelSize.class);

        if (mainImage == null){
            mainImage = this.createImage(size.getWidth(), size.getLength());
        }

        Graphics gImage = mainImage.getGraphics();

        gImage.setColor(Color.BLACK);
        gImage.fillRect(0,0, size.getWidth(), size.getLength());

        gImage.setColor(Color.ORANGE);
        gImage.setFont(new Font("正楷", Font.BOLD, 50));

        List<StuffDO> allStuff = battlefieldManager.getAllStuffDOByBattlefieldId(battlefieldId);
        if (CollectionUtils.isEmpty(allStuff)){
            throw new Exception(String.format("战场[%s]元素为空", battlefieldId));
        }
        allStuff.parallelStream().forEach(elem->
            StuffFactory.instance.paintSelf(elem)
        );
    }

    public void launch(){
        //标题
        setTitle("坦克大战");
        //窗口初始大小
        setSize(500, 500);
        //用户不能调整大小
        setResizable(false);
        //使窗口可见
        setVisible(true);
        //获取屏幕分辨率，使窗口生成时居中
        setLocationRelativeTo(null);
        //添加关闭事件
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        while (true){
            
        }
    }

}
