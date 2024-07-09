
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode temp = head;
        while(temp != null)
        {
            ListNode store = temp.next;
            temp.next=  previous;
            previous = temp;
            temp = store;
        }
    return previous;
        
    }
}
