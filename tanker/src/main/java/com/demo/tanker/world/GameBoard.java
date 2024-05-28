package com.demo.tanker.world;

import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class GameBoard extends JFrame {

    private static final GameBoard instance = new GameBoard();

    private GameBoard(){}

    public static GameBoard getBoardInstance(){
        return instance;
    }


    /**
     * 绘制战场
     * @param battlefieldId
     */
    public void paint(Long battlefieldId){

    }

}
