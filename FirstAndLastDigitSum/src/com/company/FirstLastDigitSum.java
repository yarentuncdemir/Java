package com.company;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int lastDigit=number%10;
        if (number < 0){
            return -1;
        }
        while(number>=10){
            number/=10;
        }
        return (number+lastDigit);

    }
}
