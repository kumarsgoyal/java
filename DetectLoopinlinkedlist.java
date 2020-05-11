class Solution {
    public int detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                return 1;
            }
        }
        
        return 0;
    }
}
