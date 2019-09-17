package com.company;

import java.util.Scanner;

public class TotalWithTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much does your item cost? ");

        final double TAXRATE = 0.0825;
        double price = scan.nextDouble();
        double tax = price * TAXRATE;
        double total_cost = tax + price;

        System.out.println("Price: $" + price);
        System.out.println("Sales Tax: $" + tax);
        System.out.println("Total: " + total_cost);

    }
}
