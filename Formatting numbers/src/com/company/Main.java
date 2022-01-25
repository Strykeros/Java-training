package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        // currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyRes = currency.format(1234567.891);
        System.out.println(currencyRes);

        //percent
       NumberFormat percent = NumberFormat.getPercentInstance();
       String result = percent.format(1234567.324);
        System.out.println(result);
    }
}
