package com.company;

public class TempConverter {
    public static void main(String[] args) {
        int temp_f = 78;
        int temp_c = (temp_f - 32) * 5 / 9;

        System.out.println(temp_f + " fahrenheit is equal to " + temp_c + " celsius");
    }
}
