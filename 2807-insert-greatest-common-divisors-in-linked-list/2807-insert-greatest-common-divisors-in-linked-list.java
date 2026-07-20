/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.lang.*;
class Solution {
    public int GCD(int a,int b){
    int length=Math.min(a,b);
    int gcd=1;
    for(int i=1;i<=length;i++){
        if(a%i==0&&b%i==0)
        gcd=i;
    }
    return gcd;
}
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null)
        return head;
        ListNode slow=head;
        ListNode fast=slow.next;
        do{
            ListNode temp=new ListNode(GCD(slow.val,fast.val));
            slow.next=temp;
            temp.next=fast;
            slow=slow.next.next;
            fast=fast.next;
        }
        while(fast!=null);
        return head;
    }
}