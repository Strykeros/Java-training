package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Adding items that are known before

        int[] staticNumbers = {4, 5, 1, 3}; // array of type integer (can contain only integers)
        var printTxt = "This a number " + staticNumbers[1] + " that is printed out";
        var stringArr = Arrays.toString(staticNumbers);
        System.out.println(printTxt);
        Arrays.sort(staticNumbers);

        // Adding items to array dynamically
	    int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 5;
        var convertedArr = Arrays.toString(numbers);
        //System.out.println(convertedArr);
    }
}
