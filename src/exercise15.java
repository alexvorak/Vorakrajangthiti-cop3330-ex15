/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args){

        System.out.print("What is the password? ");
    Scanner scanner = new Scanner(System.in);
    String password = scanner.nextLine();
        if (password.equals("abc$123")) {
        System.out.printf("Welcome!");
    }
            else {
        System.out.printf("I don't know you.");
    }
}

}
