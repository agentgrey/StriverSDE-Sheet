// Brute Force
// Time:O(N*M)  Space:O(1)




static Node intersectionPresent(Node head1,Node head2) {
    while(head2 != null) {
        Node temp = head1;
        while(temp != null) {

            if(temp == head2) return head2;
            temp = temp.next;
        }
        head2 = head2.next;
    }

    return null;
}




// Hashing 
// Time:(N+M) Space:O(n)



static Node intersectionPresent(Node head1,Node head2) {
     HashSet<Node> st=new HashSet<>();
    while(head1 != null) {
       st.add(head1);
       head1 = head1.next;
    }
    while(head2 != null) {
        if(st.contains(head2)) return head2;
        head2 = head2.next;
    }
    return null;

}



// Difference in lenth
// Time:O(N+M)  Space:O(1)




public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int size = Math.abs(size(headA) - size(headB));
        if(size(headA) > size(headB)){
            for(int i=0;i<size;i++){
                headA = headA.next;
            }
        }
        else{
            for(int i=0;i<size;i++){
                headB = headB.next;
            }
        }
        while(headA!=null && headB!=null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public int size(ListNode node){
        int size = 0;
        while(node!=null){
            size++;
            node = node.next;
        }
        
        return size;
    }




// Optimized
// Time:O(2*N)  Space:O(1)



static Node intersectionPresent(Node head1,Node head2) {
    Node d1 = head1;
    Node d2 = head2;
    
    while(d1 != d2) {
        d1 = d1 == null? head2:d1.next;
        d2 = d2 == null? head1:d2.next;
    }
    
    return d1;
}