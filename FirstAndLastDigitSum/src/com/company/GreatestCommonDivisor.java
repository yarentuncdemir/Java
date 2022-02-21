package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first,int second){
        if ((first<10)||(second<10)){
            return -1;
        }
        int i = 2;
        int greatestCommonDivisor = 1;
        while (i <= first && i <= second) {
            if (first % i == 0 && second % i == 0) {

                greatestCommonDivisor = i;
                System.out.println(greatestCommonDivisor);
            }
            i++;
        }
        return greatestCommonDivisor;



    }
}
