// Make a carry variable to store the carry value and add the value of the nodes
// Time:O(max(N,M))  Space:O(max(N,M))




public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode start = ans;
        int sum = 0;
        int carry = 0;
        while(l1!=null || l2!=null || carry>0) {
            int a = (l1!=null) ? l1.val : 0;
            int b = (l2!=null) ? l2.val : 0;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
            
            sum = a+b +carry;
            carry = sum/10;
            
            ListNode temp = new ListNode(sum%10);
            start.next = temp;
            start = start.next;
            
        }
        
     