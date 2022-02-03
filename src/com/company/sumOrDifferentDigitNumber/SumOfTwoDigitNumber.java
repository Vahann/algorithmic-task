package com.company.sumOrDifferentDigitNumber;

public class SumOfTwoDigitNumber {

    public static int getSumOfDigitNumber(int x) {

        int sum = 0;
        int remainder = x;

        while (remainder != 0) {
            int number = remainder % 10;
            sum = sum + number;
            remainder = remainder / 10;
        }
        return sum;
    }
}
