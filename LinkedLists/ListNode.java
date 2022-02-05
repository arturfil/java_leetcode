package LinkedLists;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {} // constructor one with now values at all
    public ListNode(int val) {this.val = val; } // constructor two with val
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; } // constructor three with val & next;
}
