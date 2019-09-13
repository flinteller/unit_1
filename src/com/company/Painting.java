package com.company;

public class Painting {
    public static void main(String[] args) {
        final int paint_buckets = 350;
        int length = 32;
        int width = 40;
        int height = 16;
        int door = 20;
        int window = 15;

        int ceiling_area = length *width;
        int total_wall_area = (((width * height) * 2) + ((length * height) * 2)) - ((door * 2) + (window * 4));

        int room_area = ceiling_area + total_wall_area;
        double buckets_needed = room_area / paint_buckets;
        System.out.println("You should buy " + buckets_needed + " buckets of paint for a room area of " + room_area + " square feet.");


    }
}
