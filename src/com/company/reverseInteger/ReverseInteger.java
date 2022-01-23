package com.company.reverseInteger;

public class ReverseInteger {

    public int reverse(int x) {

        int result = 0;

        while (x != 0) {
            int temp = x % 10;
            x = x / 10;
            result = result * 10 + temp;
        }
        return result;
    }
}
