package com.company.removeDuplicateFromSortedList;

public class RemoveDuplicateFromSortedList {

    public ListNode deleteDuplicates(ListNode head){
        //1->1->2->3
        //1->2->3
        ListNode current=head;
        while (current!=null && current.next!=null){
            if (current.next.val==current.val){
                current.next=current.next.next;
            }else {
                current=current.next;
            }
        }
        return head;
    }
}
