/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution02 {

    /*
        print "What is the input string?"
        `inputString` = read string from user
        `numChars` = length of string
        print `inputString` + " has " + `numChars` + " characters."
     */

    public static void main(String[] args) {
        System.out.print("What is the input string? ");

        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        int numChars = inputString.length();

        System.out.println(inputString + " has " + numChars + " characters.");
    }
}
