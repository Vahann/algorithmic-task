package com.company.sumOrDifferentDigitNumber;

public class DifferentOfTwoDigitNumber {

    public static int getDifferentOfDigitNumber(int x) {

        int remainder = x / 10;
        int number = x % 10;

        if(remainder>number){
            return remainder-number;
        }else {
            return number-remainder;
        }
    }
}
