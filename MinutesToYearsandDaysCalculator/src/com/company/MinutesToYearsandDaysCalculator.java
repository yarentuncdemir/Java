package com.company;

public class MinutesToYearsandDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            int totalyear=(int)(minutes/(60*24*365));
            int totalDay=(int)(minutes % (365 * 24 * 60)) / (24 * 60);;
            System.out.println(minutes + " min = " + totalyear + "y and " + totalDay +"d");
        }

    }
}
