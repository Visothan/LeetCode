/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode a=head;
        ListNode b=null;
        boolean cycle=false;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                cycle=true;
                b=slow;
                break;
            }
            else{
                cycle=false;
            }
        }
        if(cycle){
            while(a!=b){
                a=a.next;
                b=b.next;
            }
            return a;
        }
        return null;
}
}