package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a,int b,int c){
        if ((isValid(a))&&(isValid(b))&&(isValid(c))){

            if ((a % 10 == b % 10) || (b % 10 == c % 10) || c % 10 == a % 10) {
                return true;
            }

        }
        return false;

    }
    public static boolean isValid(int num){
        if(num<10||num>1000){
            return false;
        }
        return true;

    }
}
