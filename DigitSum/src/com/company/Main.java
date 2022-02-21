package com.company;

public class Main {

    public static void main(String[] args) {
        sumDigits(125);

    }
    public static int sumDigits(int number){
        int sum=0;
        int count=0;
        if(number<10){
            return -1;
        }
        while (number>0){
            int digit=number%10;
            sum+=digit;
            number/=10;

        }
        System.out.println("Sum = " + sum);
        return sum;

    }
}
