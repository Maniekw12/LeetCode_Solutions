package Day_3.Palindrome_Linked_list;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}



public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> stack = new Stack<>();

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            stack.push(slow.val);
            slow = slow.next;
        }
        // NOTE THIS IS IMPORTANT STATEMENT !!!!!!!!!!!!!
        if(fast != null){
            slow = slow.next;
        }

        while(slow != null){
            if(slow.val != stack.pop()) return false;

            slow = slow.next;
        }
        return true;
    }
}
