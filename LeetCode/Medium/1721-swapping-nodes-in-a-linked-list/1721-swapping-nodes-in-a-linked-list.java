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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head, fast = head;ListNode temp =head;
        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            temp =fast;
            fast = fast.next;    
        }
        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        swapValues(temp,slow);
        return head;
    }
    public void swapValues(ListNode node1, ListNode node2) {
        if (node1 == null || node2 == null) return;
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }

}