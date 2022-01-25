package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // integer inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        double age = scanner.nextDouble();
        System.out.println("You are " + age + " years old.");

        // String inputs
        Scanner strScanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = strScanner.nextLine().trim();
        System.out.println("You are " + name);

        print(1.2);

    }

    public static void print(Object value) {
        System.out.println(value);
    }
}
