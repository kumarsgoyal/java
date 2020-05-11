public static int getCount(Node head)
{
    if(head == null) {
        return 0;
    }
    return (1 + getCount(head.next));
    
    
    // iterative approach
    // int count = 0; 
    // while(head != null) {
    //     count += 1;
    //     head = head.next;
    // }
    // return count;
}
