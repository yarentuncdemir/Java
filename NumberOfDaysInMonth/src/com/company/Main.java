package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        boolean a,b;
        a=NumberOfDaysInMonth.isLeapYear(2022);
        NumberOfDaysInMonth.getDaysInMonth(6,2309);

        System.out.println(a);
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(6,2309));
    }
}
