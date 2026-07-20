/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode c1=headA;
        ListNode c2=headB;
        if(headA==null||headB==null)
        return null;
        while(c1!=c2){
            if(c1==null)
            c1=headB;
            else
            c1=c1.next;
            if(c2==null)
            c2=headA;
            else
            c2=c2.next;
        }
        return c1;
    }
}