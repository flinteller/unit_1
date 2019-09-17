package com.company;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the temp in fahrenheit: ");
        int temp_f = scan.nextInt();
        int temp_c = (temp_f - 32) * 5 / 9;

        System.out.println(temp_f + " fahrenheit is equal to " + temp_c + " celsius");
    }
}
