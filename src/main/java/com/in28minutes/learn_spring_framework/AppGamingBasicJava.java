package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame();

        var superContraGameRunner = new GameRunner(superContraGame);
        var marioGameRunner = new GameRunner(marioGame);
        var pacmanGameRunner = new GameRunner(pacmanGame);

        superContraGameRunner.Run();
        marioGameRunner.Run();
        pacmanGameRunner.Run();
    }
}
