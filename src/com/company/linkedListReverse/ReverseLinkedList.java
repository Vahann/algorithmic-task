package com.company.linkedListReverse;

public class ReverseLinkedList {

    /**Definition for singly-linked list
     * public class ListNode{
     *     int val;
     *     ListNode next;
     *
     *     ListNode(int x){
     *         val=x;
     *     }
     * }
     * 1->2->3->null
     * null<-3<-2-<1
     *
     */
    public ListNode reverseList(ListNode head){

//    1 -> 2 -> 3 -> null
//    null <- 3 <- 2 <- 1
        ListNode resultNode=null;
        ListNode currentNode=head;

        while (currentNode!=null){
            ListNode nextNode=currentNode.next; // new nextNode=2
            currentNode.next=resultNode;
            resultNode=currentNode;           //resultNode=currentNode=head=original
            currentNode=nextNode;
        }
        return resultNode;
    }



}
