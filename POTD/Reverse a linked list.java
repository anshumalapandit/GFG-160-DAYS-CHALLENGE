class Solution {
    Node reverseList(Node head) {
        // code here
        Node cur=head;
        Node prev=null;
        while(cur!=null){
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}
