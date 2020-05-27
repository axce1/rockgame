package org.example.controller;

import org.example.model.Field;

import java.util.Scanner;

import static org.example.model.Field.*;

public class GameLogic {

    public void launchGame() {
        System.out.println("Let's play to ROCK, PAPER, SCISSORS");
        Scanner inputScanner = new Scanner(System.in);
        User user = new User(inputScanner);
        Computer computer = new Computer();
        game(user, computer);
    }

    private void game(User user, Computer computer) {
        Field userField = user.getField();
        Field cmpField = computer.getField();
        System.out.println("Your choice is " + userField);
        System.out.println("Computer choice is " + cmpField);

        int compareField = compareFields(userField, cmpField);
        switch (compareField) {
            case 0:
                System.out.println("Tie!");
                break;
            case 1:
                System.out.println(userField + " beats " + cmpField + ". Win!");
                break;
            case -1:
                System.out.println(cmpField + " beats " + userField + ". Lose.");
                break;
        }

        if (user.playAgain()) {
            System.out.println("Start a new game");
            launchGame();
        } else {
            System.out.println("GoodBye!");
        }
    }

    public int compareFields(Field userField, Field cmpField) {
        if (userField == cmpField)
            return 0;

        switch (userField) {
            case ROCK:
                return (cmpField == SCISSORS ? 1 : -1);
            case PAPER:
                return (cmpField == ROCK ? 1 : -1);
            case SCISSORS:
                return (cmpField == PAPER ? 1 : -1);
        }

        return 0;
    }
}
