package com.company.sumOfNumbersUpToN;

public class SumOfNumbersUpToN {

    public static int sumOfNumbersUpToN(int x) {

        int sum=0;
        for (int i = 0; i <= x; i++) {
            sum+=i;
        }
        return sum;
    }
}
