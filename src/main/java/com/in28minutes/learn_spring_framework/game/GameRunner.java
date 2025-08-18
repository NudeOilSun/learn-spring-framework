package com.in28minutes.learn_spring_framework.game;

public class GameRunner {
    MarioGame game;

    public GameRunner(MarioGame game){
        this.game = game;
    }

    public void Run() {
        System.out.println("Running Game: " + game);
        game.Up();
        game.Down();
        game.Left();
        game.Right();
    }
}
