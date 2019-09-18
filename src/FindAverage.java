package com.company;

import java.util.Scanner;


public class FindAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double avg = 0;

        System.out.println("Please enter four lengths to be averaged:");
        System.out.println("Value 1: ");
        avg += scan.nextDouble();
        System.out.println("Value 2: ");
        avg += scan.nextDouble();
        System.out.println("Value 3: ");
        avg += scan.nextDouble();
        System.out.println("Value 4: ");
        avg += scan.nextDouble();
        System.out.println("Your Average: " + (avg/4));



    }
}
