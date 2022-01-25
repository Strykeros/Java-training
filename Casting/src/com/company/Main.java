package com.company;

public class Main {

    public static void main(String[] args) {
        // implicit casting (auto converting)
	    short x = 4;
        int y = x + 2;
        System.out.println(y);

        // explicit casting (manual conversion)
        double x2 = 1.1;
        int y2 = (int) x2 + 2;
        System.out.println(y2);
    }
}
