class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1 , null);
        ListNode temp = dummy;
        while(list1 != null && list2 != null)
        {
            if(list1.val  > list2.val)
            {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
            else
            {
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }
        }
        if(list1 != null)
            temp.next= list1;
        if(list2 != null)
            temp.next = list2;
    return dummy.next;    
    }
}
