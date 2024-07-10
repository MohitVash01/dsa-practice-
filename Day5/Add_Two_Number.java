class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode head1 = l1;
        ListNode head2 = l2;
        while(head1 !=null || head2!=null || carry ==1)
        {
            int sum = 0;
            if(head1 !=null)
            {
                sum += head1.val;
                head1 = head1.next;
            }
            if(head2 != null)
            {
                sum += head2.val;
                head2 = head2.next;
            }
            sum += carry;
            carry = sum/10;
    
            ListNode new_node = new ListNode(sum%10);
            temp.next = new_node;
            temp = temp.next;

        }
    return dummy.next;
    }
}
