

public class leetcode234 {
    public boolean isPalindrome(ListNode head) {
        ListNode l1 = head; 
        ListNode l2 = head; 
        while(l2 != null && l2.next != null) {
            l1 = l1.next;   
            l2 = l2.next.next;  
        }
        l2 = head;  
        l1 = reverseList(l1);   
        while(l1 != null && l1.val == l2.val) { 
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null ? true : false;  
    }
     public ListNode reverseList(ListNode head) {   
        ListNode next = null, pre = null;
        while(head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}

