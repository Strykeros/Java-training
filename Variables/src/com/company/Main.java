package com.company;

public class Main {

    public static void main(String[] args) {
        int myAge = 30; //whole number
        String text = "abc"; // text
        boolean trueOrFalse = false; // true or false
        double kilometers = 3.2; // number with comma
        Object multiVar = true; // universal way to declare any type of variable
        String[] array = {"test1"}; // string array
        Object[] multiArray = {"teest", 1, 2.2, true, "A"}; // multiple variable type array
        for(int i = 0; i < multiArray.length; i++){
            System.out.println(multiArray[i]);
        }
    }
}
