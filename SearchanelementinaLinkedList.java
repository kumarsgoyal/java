bool search(struct Node* head, int x)  
{  
    // Base case  
    if (head == NULL)  
        return false;  
      
    // If key is present in current node, return true  
    if (head->key == x)  
        return true;  
  
    // Recur for remaining list  
    return search(head->next, x);  
} 


// bool search(Node* head, int x)  
// {  
//     Node* current = head; // Initialize current  
//     while (current != NULL)  
//     {  
//         if (current->key == x)  
//             return true;  
//         current = current->next;  
//     }  
//     return false;  
// }
