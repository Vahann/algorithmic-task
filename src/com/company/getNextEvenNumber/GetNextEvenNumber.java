package com.company.getNextEvenNumber;

public class GetNextEvenNumber {

    public static int getNextEvenNumber(int x) {

        int temp = ++x;


        if ((temp % 2) == 0) {
            return temp;
        } else {
            return getNextEvenNumber(temp);
        }
    }
}
