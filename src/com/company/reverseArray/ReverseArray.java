package com.company.reverseArray;

public class ReverseArray {

    public static int[] reverse3(int[] nums) {

        int size;

        if (nums.length % 10 == 0) {
            size= nums.length/2-1;
        }else {
            size= nums.length/2;
        }

            for (int i = 0; i < size; i++) {

                int lastIndex = nums.length - 1 - i;

                int temp = nums[i];

                nums[i] = nums[lastIndex];

                nums[lastIndex] = temp;
            }

        return nums;
    }
}

