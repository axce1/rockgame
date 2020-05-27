package org.example.controller;

import org.example.service.IField;
import org.example.model.Field;

import java.util.Scanner;

public class User implements IField {

    private Scanner inputScanner;

    public User(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public Field getField() {
        System.out.println("Input your choice and press Enter: ");
        String inputUser = inputScanner.nextLine();
        inputUser = inputUser.toLowerCase();
        String fstChar = String.valueOf(inputUser.charAt(0));
        if ("rps".contains(fstChar)) {
            switch (fstChar) {
                case "r":
                    return Field.ROCK;
                case "p":
                    return Field.PAPER;
                case "s":
                    return Field.SCISSORS;
            }
        }
        System.out.println("Wrong choice, try again...");
        return getField();
    }

    public boolean playAgain() {
        System.out.print("Play again? [Y/N]");
        String userInput = inputScanner.nextLine();
        userInput = userInput.toLowerCase();
        return userInput.charAt(0) == 'y';
    }
}
