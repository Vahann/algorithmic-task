package com.company.arrayZeroDuble;

import java.util.Arrays;

public class ArrayZeroDouble {

    //1,0,3,0,4,6,7,8,9
    //1,0,0,3,0,0,4,6,7

    public static void changeArray(int[] array) {

        for (int i = 0; i < array.length-2; i++) {
            if (array[i] == 0) {
                int index=i;
                    int temp=array[index];
//                    array[index+1]=temp;
                    array[index+2]=temp;
                    array[index]=0;


            }
        }
        System.out.println(Arrays.toString(array));
    }
}
