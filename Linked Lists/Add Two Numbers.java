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
    private ListNode helper(ListNode l1,ListNode l2, int carry){
        if(l1!= null || l2!= null || carry != 0){
            int d1 = l1 == null ? 0 :l1.val;
            int d2 = l2 == null ? 0 :l2.val;

            int sum = d1+d2 +carry;
            int digit = sum%10;
            carry =0;
            if(sum >= 10){
                carry = sum/10;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

            ListNode ans = new ListNode(digit , helper(l1,l2,carry));
            return ans;
        }
        return null;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1!=null && l2 != null){
            int sum = l1.val + l2.val;
            int digit = sum%10;
            int carry =0;
            if(sum >= 10){
                carry = sum/10;
            }
            ListNode ans = new ListNode(digit , helper(l1.next,l2.next,carry));
            return ans;
        }
        else if(l1 == null){
            return l2;
        }
        return l1;
    }
}
