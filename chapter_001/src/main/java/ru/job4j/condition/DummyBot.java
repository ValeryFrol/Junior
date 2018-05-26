package ru.job4j.condition;

import java.util.Scanner;


public class DummyBot {
    public String answer(String inputString) {
        String outputString = "Ask me smth else please";
        if ("Hi Bot!".equals(inputString)) {
            outputString = "Hi dude!";
        } else if ("Bye!".equals(inputString)) {
            outputString = "See ya soon!";
        }
        return outputString;
    }


}
