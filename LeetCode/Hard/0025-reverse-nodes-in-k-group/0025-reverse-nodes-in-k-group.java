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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> list =new ArrayList<>();
        ListNode temp = head;
        int count=0;
        while(temp!=null&&count<k){
            temp=temp.next;
            count++;
        }
        if(count<k) return head;

        ListNode first =null; 
        ListNode second=null;
        ListNode newHead=head;
        for(int i=0;i<k;i++){
            second=newHead.next;
            newHead.next=first;
            first=newHead;
            newHead=second;
        }
        head.next=reverseKGroup(newHead,k);
        return first;
    }
}