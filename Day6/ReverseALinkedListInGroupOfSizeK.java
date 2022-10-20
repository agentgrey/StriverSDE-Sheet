// Time:O(N)  Space:O(1)




 public ListNode reverseKGroup(ListNode head, int k) {
        ListNode a = new ListNode(0);
        a.next = head;
        int n = length(head);
        
        ListNode pre = a;
        ListNode cur;
        ListNode nex;

        while(n >= k) {
            cur = pre.next;
            nex = cur.next;
            for(int i=1;i<k;i++) {
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            pre = cur;
            n -= k;
        }
        return a.next;
    }
    
    public int length(ListNode n) {
        if(n==null) return 0;
        if(n.next==null) return 1;
        
        return 1+length(n.next);
    }