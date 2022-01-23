package com.company.isPolindrome;

public class IsPalindromeString {

    public static boolean isPalindromeStringBuilder(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    public static boolean isPalindromeStringIteration(String s){
        int length=s.length();
        for (int i = 0; i < length/2; i++) {
            if (s.charAt(i) !=s.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
}
