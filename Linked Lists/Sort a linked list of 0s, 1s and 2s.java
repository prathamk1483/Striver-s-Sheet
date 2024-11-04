class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        if (head == null || head.next == null)
          return head;
            
        // step 1. cut the list to two halves
        Node prev = null, slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
          prev = slow;
          slow = slow.next;
          fast = fast.next.next;
        }
        
        prev.next = null;

        Node l1 = segregate(head);
        Node l2 = segregate(slow);

        return merge(l1, l2);
    }
    static Node merge(Node l1 , Node l2){
        Node l = new Node(0) , p = l;
        
        while (l1 != null && l2 != null) {
              if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
              } else {
                p.next = l2;
                l2 = l2.next;
              }
              p = p.next;
            }
            
            if (l1 != null)
              p.next = l1;
            
            if (l2 != null)
              p.next = l2;
            
            return l.next;
    }
}
