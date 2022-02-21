package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average = 0;
        int count = 0;

        while(true) {

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                average = (double) sum/ (double) count;
                average = Math.round(average);
            }
            else{

                System.out.println("SUM = " + sum + " AVG = " + average);
                break;}
            scanner.nextLine();
        }

        scanner.close();
    }

}
