class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // base case
        if(head == null) return null;

        // if elements are less than k then we will return head;
        int count =0;
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = null;

        while(curr!= null && count <k){
            count++;
            curr= curr.next;
        }

        if(count<k ) return head;

        // now reverse k elements 
        curr =head; 
        count =0;

        while(curr!= null && count<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
            count++;
        }

        // recurse for next group
        if(next!= null){
            head.next = reverseKGroup(next , k);
        }
        return prev;
    
    }

}
