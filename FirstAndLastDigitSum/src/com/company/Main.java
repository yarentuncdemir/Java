package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //  System.out.println(FirstLastDigitSum.sumFirstAndLastDigit (-20) );
        //  System.out.println(EvenDigitSum.getEvenDigitSum (-320) );
        // System.out.println(SharedDigit.hasSharedDigit(23,72));
       // System.out.println(LastDigitChecker.hasSameLastDigit(23,72,191));
        //System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(32,64));
        //FactorPrinter.printFactors(42);


        //parsing value from string
        String numberAsString="2018";
        String dnumberAsString="2018.235";
        System.out.println(numberAsString);

        int number=Integer.parseInt(numberAsString);
        System.out.println(number);
        double dnumber=Double.parseDouble(dnumberAsString);
        System.out.println(dnumber);

        numberAsString+=1;
        number+=1;
        dnumber+=1;
        System.out.println(numberAsString);
        System.out.println(number);
        System.out.println(dnumber);

        //System.out.println(FlourPacker.canPack (-3, 0, 5));
        //LargestPrime.getLargestPrime(42);
        DiagonalStar.printSquareStar(5);



    }
}
