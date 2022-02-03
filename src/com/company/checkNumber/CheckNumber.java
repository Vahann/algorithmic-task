package com.company.checkNumber;

public class CheckNumber {

    //проверить, является ли число числом во второй степени
    public static boolean checkNumber(int x){

// it is no correct

        int temp=x/2;
        if(temp!= 0 && temp%2==0){
            checkNumber(temp);
            return true;
        }
        return false;
    }
}
