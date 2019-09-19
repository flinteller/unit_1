package com.company;
import java.util.Scanner;

public class RoundTenth {
        public static void main(String[] args) {
            Scanner scan  = new Scanner(System.in);
            double user_num;
            System.out.println("Enter decimal number: ");
            user_num = scan.nextDouble();
            int rounded_num = (int)(user_num * 100);
            rounded_num += 5;
            double new_num = ((double) (rounded_num / 10)) / 10;
            System.out.println(user_num + " rounded to the nearest tenth " + new_num);


        }
}
