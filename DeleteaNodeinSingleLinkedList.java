class GfG
{
    Node deleteNode(Node head, int x)
    {
        Node result = null;
	    if(head == null) {
	        return result;
	    }
	    
	    if(x == 1) {
	        result = head.next;
	        head = null;
	        return result;
	    }
	    
	    result = head;
	    
	    for(int i = 1; head != null && i < (x - 1); i++) {
	        head = head.next;
	    }
	    
	    if(head == null) {
	        return result;
	    }
	    
	    if(head.next != null) {
	        head.next = head.next.next;
	    }
	    
	    return result;
	    
	    
    }
    
}
