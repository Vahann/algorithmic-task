package com.company.checkNumberIsPowerOfTwo;

public class IsPowerOfTwo {

    //проверить, является ли число числом во второй степени
    public static boolean checkNumberIsPowerOfTwo(int number) {

        for (int i = 1; i <= number; i = i * 2) {
            if (i == number)
                return true;
        }
        return false;
    }


    public static boolean checkNumberIsPowerOfTwoVersionTwo(int number) {
        return number > 0 && (number & -number) == number;
    }


    public static boolean checkNumberCustomIsPowerOfTwo(int number) {

        int temp = number;
        if ((temp > 0 && temp % 2 == 0)) {
            temp /= 2;
            if (temp == 1) {
                return true;
            }
            return checkNumberCustomIsPowerOfTwo(temp);
        }
        return false;
    }
}
