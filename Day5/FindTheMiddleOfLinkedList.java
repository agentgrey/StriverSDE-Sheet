// Using fast and slow pointer 
// Time:O(N)  Space:O(1)




public ListNode middleNode(ListNode head) {
        ListNode slow = head;
	  ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }