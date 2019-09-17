package com.company;
import java.util.Scanner;

public class PoundsToKilos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter weight in pounds: ");

        double lbs;
        double kg;

        lbs = scan.nextDouble();
        kg = lbs / 2.205;
        System.out.println(lbs + " pounds = " + kg + " kilograms");
    }
}
