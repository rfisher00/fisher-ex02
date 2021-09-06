/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Fisher
 */

/*
pseudocode:
implement input necessities
prompt user for input
save the input
derive the length from the input
return the length
 */

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the input string?");
        String inpStr= sc.nextLine();
        int len = inpStr.length();
        System.out.printf("%s has %d characters", inpStr, len);
    }
}