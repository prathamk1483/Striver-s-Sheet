class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int size =0;
        if(head.next == null) return null;
        ListNode temp = head;
        while(temp !=null){
            size++;
            temp = temp.next;
        }
        int count=0;
        temp = head;
        while(count < (size/2)-1){
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
        return head;
    }
}
