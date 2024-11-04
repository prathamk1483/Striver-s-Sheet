
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode evenhead = new ListNode(-1);
        ListNode oddhead = new ListNode(-1);
        ListNode even = evenhead , odd = oddhead;

        int count = 1;
        ListNode temp = head;

        while(temp != null){
            if(count %2 == 0){
                even.next = new ListNode(temp.val);
                even = even.next;
            }
            else{
                odd.next = new ListNode(temp.val);
                odd = odd.next;
            }
            temp = temp.next;
            count++;
        }
        odd.next = evenhead.next;
        return oddhead.next;
    }
}
