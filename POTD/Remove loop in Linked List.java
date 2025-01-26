class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here{
        if(head==null || head.next==null){
            return ;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break; // loop detected
            }
        }
        if(fast==null || fast.next==null){
            return;
        }
        slow=head;
        if(slow==fast){
        while(fast.next!=slow){
            fast=fast.next;
        }
        }else{
             // General case
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
        }
        }
        fast.next=null; // loop removed
    } 
}
