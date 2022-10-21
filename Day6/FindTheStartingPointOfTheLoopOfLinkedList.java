// Using HashMap
// Time:O(N)  Space:O(N)




static Node detectCycle(Node head) {
    HashSet<Node> st=new HashSet<>();
    while(head != null) {
        if(st.contains(head)) return head;
        st.add(head);
        head = head.next;
    }
    return null;
}



// Slow and Fast pointer
// Time:O(N)  Space:O(1)



public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow) {
                ListNode temp = head;
                while(temp!=slow) {
                    temp = temp.next;
                    slow = slow.next;
                }
                
                return slow;
            }
        }
        
        return null;
    }