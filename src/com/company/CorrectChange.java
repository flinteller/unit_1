package com.company;
import java.util.Scanner;

/*
Flint Eller
9/23/19

This program takes a whole number of cents and gives the smallest number of coins possible.
 */



public class CorrectChange {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int user_change;
    int num_dollars;
    int num_quarters;
    int num_dimes;
    int num_nickles;
    int num_pennies;

    System.out.println("Enter a whole number of cents: ");
    user_change = scan.nextInt();


    num_dollars = user_change / 100;
    user_change -= (num_dollars * 100);

    num_quarters = user_change / 25;
    user_change -= (num_quarters * 25);

    num_dimes = user_change / 10;
    user_change -= (num_dimes * 10);

    num_nickles = user_change / 5;
    user_change -= (num_nickles * 5);

    num_pennies = user_change;


    System.out.println("You have " + num_dollars + " dollars, " + num_quarters + " quarters, " + num_dimes + " dimes, " + num_nickles + " nickles, and " + num_pennies + " pennies.");

}
}
