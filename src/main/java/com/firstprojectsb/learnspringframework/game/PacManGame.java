package com.firstprojectsb.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component  //permite que o spring crie beans por conta propria
public class PacManGame implements GamingConsole {

    public void up(){
        System.out.println("Go up");
    }

    public void down(){
        System.out.println("Go down");
    }

    public void left(){
        System.out.println("Go left");
    }

    public void right(){
        System.out.println("Go right");
    }
}
