class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        if(head==null || head.next==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return new Node(-1);
        }
        // now Find first node
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow;
    }
}
