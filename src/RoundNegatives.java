package com.company;
import java.util.Scanner;


public class RoundNegatives {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double user_num;
        System.out.println("Enter a negative decimal number: ");
        user_num = scan.nextDouble();
        int rounded_num = (int)(user_num - 0.5);
        System.out.println(user_num + "rounded to a whole number is: " + rounded_num);
    }
}
