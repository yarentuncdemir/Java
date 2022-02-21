package com.company;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {

        if(number < 1) {

            return false;

        }
        int perfect = 0;
        for(int i = 1; i < number; i++) {

            if(number % i == 0) {

                perfect += i;

            }
            if(perfect == number) {

                return true;

            }

        }
        return false;

    }

}

