package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1,int num2) {
        if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99) {
            return false;
        }
        int lastDigitNumberOne = num1 % 10;
        int firstDigitNumberOne = num1 / 10;

        while (num2 > 0) {
            int remainder = num2 % 10;
            num2 /= 10;

            if (lastDigitNumberOne == remainder || (lastDigitNumberOne == num2) ||
                    firstDigitNumberOne == remainder || firstDigitNumberOne == num2) {
                return true;
            }
        }

        return false;
    }

}
