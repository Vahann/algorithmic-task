package com.company;

import com.company.isPolindrome.IsPalindromeString;
import com.company.linkedListReverse.ListNode;
import com.company.linkedListReverse.ReverseLinkedList;
import com.company.isPolindrome.IsPalindromeNumber;

public class Main {

    public static void main(String[] args) {

        ReverseLinkedList revers = new ReverseLinkedList();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        System.out.println(listNode.toString());
        System.out.println(revers.reverseList(listNode));

        System.out.println(IsPalindromeNumber.isPalindromeInt(121));
        System.out.println(IsPalindromeString.isPalindromeStringBuilder("avva"));
    }
}
