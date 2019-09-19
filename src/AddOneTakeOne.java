package com.company;
import java.util.Scanner;

public class AddOneTakeOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Please enter a number: ");
        num = scan.nextInt();

        num--;
        System.out.print(num);
        num++;
        System.out.print(num);
        num++;
        System.out.print(num);
    }
}
