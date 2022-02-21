package com.company;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void MinMax(){
        Scanner scanner =new Scanner(System.in);
        int min=0;
        int max=0;
        boolean first=true;
        while(true){

            System.out.println("Enter number: ");
            boolean isAnInıt= scanner.hasNextInt();
            if(isAnInıt){
                int number=scanner.nextInt();
                if (first){
                    first=false;
                    min=number;
                    max=number;
                }
                if(number>max){
                    max=number;
                }
                if(number<min){
                    min=number;
                }

            }
            else {
                System.out.println("Invalid Value");
                break;

            }
            scanner.nextLine();
        }
        System.out.println("min="+min+" "+ "max="+max);
        scanner.close();





    }
}
