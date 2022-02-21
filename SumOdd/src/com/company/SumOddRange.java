package com.company;

public class SumOddRange {

    public static boolean isOdd(int num){
        if(num>=0){
            if(num%2==0){
                return true;
            }
            else
                return false;

        }


        return false;

    }

    public static int sumOdd(int start,int end){
        int sum=0;
        if((start>0)&&(end>0)&&(end>start)){
            for(int i=start;i<=end;i++){
                if(isOdd(i)){
                    sum=sum+i;
                }

            }
            return sum;
        }
        return -1;

    }
}
