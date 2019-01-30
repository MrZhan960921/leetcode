package com.zcq;

/**
 * @author 占超群
 * @data 2019/1/28 23:02
 */
public class Solution2 {
    // Definition for singly-linked list.

    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    public ListNode reverse(ListNode pre,ListNode cur){
        ListNode listNode=cur.next;
        cur.next=pre;
        return reverse(cur,listNode);
    }


    public static void main(String[] args) {
        ListNode five=new com.zcq.ListNode(5);
        ListNode fourth=new com.zcq.ListNode(4);
        ListNode three=new com.zcq.ListNode(3);
        ListNode second=new com.zcq.ListNode(2);
        ListNode one=new com.zcq.ListNode(1);
        fourth.next=five;
        three.next=fourth;
        second.next=three;
        one.next=second;
        Solution2 solution2=new Solution2();
        solution2.reverseList(one);
    }
}
