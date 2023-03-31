package com.company;

import com.company.checkNumberIsPowerOfTwo.IsPowerOfTwo;
import com.company.multyThread.NewThread;
import com.company.sortedArrayAndCheckIncrementCodesignalTask.SortedArrayAndIncrementOnlyOnce;
import com.company.sortingArray.SortedArray;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Main {

    public static int myMethod(int x) {
        return x = x + 1;
    }

    public static void main(String[] args) throws InterruptedException {

//        ReverseLinkedList revers = new ReverseLinkedList();
//        ListNode listNode = new ListNode(1);
//        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(3);
//        System.out.println(listNode.toString());
//        System.out.println(revers.reverseList(listNode));
//
//        System.out.println(IsPalindromeNumber.isPalindromeInt(121));
//        System.out.println(IsPalindromeString.isPalindromeStringBuilder("avva"));
//
////   gb.ru
////   quizterra.com
////   onlineTestPad.com
////   soloLearn

//        int [] array={1,2,4,5,6};
//        System.out.println(Arrays.toString(ReverseArray.reverse3(array)));

//        System.out.println(SumOfTwoDigitNumber.getSumOfDigitNumber(23));
//        System.out.println(DifferentOfTwoDigitNumber.getDifferentOfDigitNumber(52));
//        System.out.println(GetNextEvenNumber.getNextEvenNumber(62));
//        System.out.println(SumOfNumbersUpToN.sumOfNumbersUpToN(5));
//        System.out.println(FromAToBMinimumSteps.mapNumber(10,6));
//        System.out.println(IfAGreaterBReturnAMultiplyCElseReturnB.checkNumber(3,4,6));
//        System.out.println(CheckNumber.checkNumber(16));
//        System.out.println(CheckNumber.checkNumberVersionTwo(1024));
//        int i=1024;
//        System.out.println(IsPowerOfTwo.checkNumberCustomIsPowerOfTwo(i));
//        System.out.println(IsPowerOfTwo.checkNumberIsPowerOfTwoVersionTwo(i));

//      new NewThread();
//      //  tr.run();


//        for (int i = 5; i >0 ; i--) {
//            System.out.println("Main thread "+i +Thread.currentThread().getName() );
//            Thread.sleep(1000);
//        }
        int[] arr = {8, 0, 1, 5};
//        int [] arr={1, 2, 1, 2};
//        System.out.println(SortedArrayAndIncrementOnlyOnce.solution(arr));
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void selectionSort(int[] arr) {
        int minElemIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minElemIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElemIndex]) {
                    minElemIndex = j;
                }
            }
            int temp = arr[minElemIndex];
            arr[minElemIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
