
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    if(head == null||head.next == null||k == 0) return head;
    ListNode temp = head;
    int length = 1;
    while(temp.next != null) {
        ++length;
        temp = temp.next;
    }
    temp.next = head;
    k = k%length;
    int end = length-k; // to find how much ahead we need to shift head
    ListNode new_head = head;
    ListNode prev = new_head;
    while(end != 0)
    {
        end--;
        prev = new_head;
        new_head = new_head.next;
    }
    head = new_head;
    prev.next= null;
        
    return head;

    }
}
