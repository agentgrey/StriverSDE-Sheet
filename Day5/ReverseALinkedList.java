// Using three-pointers
// Time:O(N)  Space:O(1)




public ListNode reverseList(ListNode head) {
         if(head==null || head.next==null) return head;
        
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while(current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        head = prev;
        return head;
    }



// Recursive: the base operation is manipulating the pointers of each node at the end, the original head should be pointing towards NULL and the original last node should be the 'head' of the reversed Linked List
// Time:O(N)  Space:O(1)




public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }





