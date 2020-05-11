class GFG
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
        // s    s    s
        // 1--->2--->3--->4--->5--->null
        // f		  f		   f
        
        
        // s    s    s	  s
        // 1--->2--->3--->4--->5--->6--->null
        // f		 f		   f         f
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow.data;
   }
}
