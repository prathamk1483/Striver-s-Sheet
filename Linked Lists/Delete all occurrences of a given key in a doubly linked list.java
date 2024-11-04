class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node dummy = new Node();
        dummy.next = head;
        Node cur = head;
        Node prev = dummy;
        
        while(cur != null){
            if(cur.data == x){
                prev.next = cur.next;
                if(cur.next != null){
                    cur.next.prev = prev;
                }
                cur = prev.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
