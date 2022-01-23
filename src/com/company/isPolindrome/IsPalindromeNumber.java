package com.company.isPolindrome;

public class IsPalindromeNumber {

    public static boolean isPalindromeInt(int x) {
        if (x < 0) return false;

        if (x % 10 == 0 && x != 0) return false;

        int reverseNumber = 0;
        int copyNumber = x;

        while (copyNumber != 0) {
            reverseNumber = reverseNumber * 10 + copyNumber % 10;
            copyNumber = copyNumber / 10;
        }
        return reverseNumber== x;
    }
}
