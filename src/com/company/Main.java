package com.company;

import com.company.checkNumberIsPowerOfTwo.IsPowerOfTwo;

public class Main {


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
        int i=1024;
        System.out.println(IsPowerOfTwo.checkNumberCustomIsPowerOfTwo(i));
        System.out.println(IsPowerOfTwo.checkNumberIsPowerOfTwoVersionTwo(i));


    }
}
