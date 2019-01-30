/**
 * @author 占超群
 * @data 2019/1/28 23:47
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode p = dummyHead;
        while(p.next != null && p.next.next != null ){
            ListNode node1 = p.next;
            ListNode node2 = node1.next;
            ListNode next = node2.next;
            node2.next = node1;
            node1.next = next;
            p.next = node2;
            p = node1;
        }

        return dummyHead.next;
    }


    public static void main(String[] args) {
        ListNode four=new ListNode(4);
        ListNode three=new ListNode(3);
        ListNode second=new ListNode(2);
        ListNode one=new ListNode(1);
        three.next=four;
        second.next=three;
        one.next=second;
        Solution solution=new Solution();
        solution.swapPairs(one);
    }
}
