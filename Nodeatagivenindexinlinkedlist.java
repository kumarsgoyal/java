class GfG
{
   
    public static int getNth(Node node, int index)
    {
       for(int i = 1; i < index; i++) {
           node = node.next;
       }
       
       return node.data;
    }
}
