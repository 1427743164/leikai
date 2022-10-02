/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class leetcode83 {
    public ListNode deleteDuplicates(ListNode head) {
       if(head==null||head.next==null){
        return head;
       }
        ListNode pNode=head;
        while (pNode.next!=null){
            Integer nodeVal=pNode.val;
            Integer nextNodeVal=pNode.next.val;
            if(nodeVal.equals(nextNodeVal)){
                pNode.next=pNode.next.next;
            } else{
                pNode=pNode.next;
            }
        }
            return head;
    }
}