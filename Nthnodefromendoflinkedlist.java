class GfG
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getCount(Node head) {
        int count = 0;
        while(head != null) {
            head = head.next;
            count += 1;
        }
        
        return count;
    }
    int getNthFromLast(Node head, int n)
    {
    	int length = getCount(head);	
    	if(n > length) {
    	    return -1;
    	}
    	
    	// index = length - n + 1
    	int index = length - n;
    	while(index != 0) {
    	    index--;
    	    head = head.next;
    	}
    	
    	return head.data;
    	
    }
}
