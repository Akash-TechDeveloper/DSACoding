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
    public ListNode mergeKLists(ListNode[] lists) {
        Queue <ListNode> q = new ArrayDeque<>();
        for(ListNode head : lists){
            if(head!=null) q.offer(head);
        }
        while(q.size()>1){
            ListNode l1 = q.poll();
            ListNode l2 = q.poll();
            q.offer(mergeList(l1,l2));
        }
        return q.isEmpty() ? null : q.poll();
    }
    public ListNode mergeList(ListNode l1,ListNode l2){
        ListNode temp = new ListNode(-1),tail = temp;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                tail.next=l1;
                l1=l1.next;
            }
            else {
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return temp.next;
    }
}