package com.company;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){
        if(Math.round(num1)==Math.round(num2)){

            return true;
        }
        return false;
    }
}
