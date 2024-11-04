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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(head==null){
            return null;
        }
        if(head.next ==null && n==1){
            return null;
        }
        if(n==count){
            head = head.next;    
            return head;
        }
        temp=head;
        ListNode ans=temp;int t=0;
        while(t <(count-n-1)){
            temp=temp.next;
            t++;
        }
        temp.next=temp.next.next;
        return ans;
    }
}
