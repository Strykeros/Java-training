package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String message = "         Hello world!" + "!!!!!!!!!!";
        System.out.println(message.length());
        System.out.println(message.replace("world", "sky"));
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

        System.out.println(message);
    }
}
