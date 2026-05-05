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
    public ListNode rotateRight(ListNode head, int k) {

        // edge case
        if (head == null || head.next == null || k == 0)
            return head;

        // Step 1: count length + reach tail
        int n = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        // Step 2: make it a circle
        tail.next = head;

        // Step 3: find new tail
        // new tail is at position (n - k%n - 1)
        k = k % n;
        int stepsToNewTail = n - k - 1;
        ListNode newTail = head;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // Step 4: break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}