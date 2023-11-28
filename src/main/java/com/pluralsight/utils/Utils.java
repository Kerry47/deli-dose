package com.pluralsight.utils;

import java.util.Scanner;

public class Utils {
    static Scanner scanner = new Scanner(System.in);
    public static char getCharInput() {
        String userInput = scanner.nextLine().toUpperCase().trim();
        if (!userInput.isEmpty()) {
            return userInput.charAt(0);
        } else {
            return getCharInput();
        }
    }

    public static String getStringInput(String prompt) {
        String input;

        System.out.println(prompt);
        input = scanner.nextLine().trim();

        while (input.isEmpty()) {
            System.out.println("Invalid input. Please enter a non-empty input: ");
            input = scanner.nextLine().trim();
        }

        return input;
    }
}
