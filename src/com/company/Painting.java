package com.company;
import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {

        double length;
        double width;
        double height;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of you room in feet:");
        length = scan.nextDouble();

        System.out.println("Please enter the height of you room in feet:");
        height = scan.nextDouble();

        System.out.println("Please enter the width of you room in feet:");
        width = scan.nextDouble();

        final int paint_buckets = 350;

        double ceiling_area = length * width;
        double total_wall_area = ((width * height) * 2) + ((length * height) * 2);

        double room_area = ceiling_area + total_wall_area;
        double buckets_needed = room_area / paint_buckets;
        System.out.println("You should buy " + buckets_needed + " buckets of paint for a room area of " + room_area + " square feet.");


    }
}
