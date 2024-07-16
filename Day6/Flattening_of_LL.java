class GfG {
    Node flatten(Node root) {
        // Your code here
        if(root== null || root.next == null) return root;
        root.next = flatten(root.next);
        root = merge(root , root.next);
    return root;
        
    }
    static Node merge(  Node l1 , Node l2)
    {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while(l1 != null && l2 != null)
        {
            if(l1.data <= l2.data)
            {
                temp.bottom = l1;
                l1 = l1.bottom;
            }
            else
            {
                temp.bottom = l2 ; 
                l2 = l2.bottom;
            }
            temp = temp.bottom;
        }
        if(l1 != null) temp.bottom = l1;
        if(l2 != null ) temp.bottom = l2;
    return dummyNode.bottom;
    }
}
