// Move the last element to the first for each K
// Time:O(K)  Space:O(1)




static Node rotateRight(Node head, int k) {
    if (head == null || head.next == null) return head;
    for (int i = 0; i < k; i++) {
      Node temp = head;
      while (temp.next.next != null) temp = temp.next;
      Node end = temp.next;
      temp.next = null;
      end.next = head;
      head = end;
    }
    return head;
  }




// Optimal Solution
// Time:O(N)  Space:O(1)    





public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        
        k = k%length(head);
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(k != 0) {
            fast = fast.next;
            k--;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        fast.next = head;
        head = slow.next;
        slow.next = null;
        
        return head;
    }
    
    public int length(ListNode head) {
        if(head == null) return 0;
        if(head.next == null) return 1;
      