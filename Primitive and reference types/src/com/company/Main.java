package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        byte x = 30;
        byte y = x;
        x = 2;
        System.out.println(y);

        // Reference type interaction

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 23;
        System.out.println(point2);
    }
}
