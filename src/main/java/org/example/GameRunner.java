package org.example;

import org.example.controller.GameLogic;

public class GameRunner {
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();
        gameLogic.launchGame();
    }
}
