package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Reese Spector
 */

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);                             //scanner
        System.out.print("What is the input string? ");                     //prompt
        String userInput = input.nextLine();                                //get input
        int inlength = userInput.length();                                  //get length
        System.out.print(userInput + " has " + inlength + " characters.");  //print

    }

}
