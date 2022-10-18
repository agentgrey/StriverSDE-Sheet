// Two pointer
// Time:O(N)  Space:O(1)




public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode a = newHead;
        ListNode b = newHead;
        while(n > 0){
            b = b.next;
            n--;
        }
        while(b.next != null){
            b = b.next;
            a = a.next;
        }
        a.next = a.next.next;
        return newHead.next;
    }