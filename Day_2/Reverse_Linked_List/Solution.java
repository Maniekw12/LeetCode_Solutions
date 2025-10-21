package Day_2.Reverse_Linked_List;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode first = head;
        ListNode second = null;

        while(first != null){
            ListNode temp = first.next;
            first.next = second;
            second = first;
            first = temp;
        }
        return second;
    }
}