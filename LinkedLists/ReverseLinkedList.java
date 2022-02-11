package LinkedLists;

public class ReverseLinkedList {
    public ListNode reverseLinkedList(ListNode head) {
        ListNode temp = null;
        while(head != null) {
            ListNode current = head.next;
            head.next = temp;
            temp = head;
            head = current;

        }
        return temp;
    }
}

/*
    TESTING
    ListNode head = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);
    head.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    var rev = new ReverseLinkedList();
    rev.reverseLinkedList(head);

    EXPLANATION
    - You are simply changin the direction of the .next property of the class
    - For that you need three nodes:
    - [1] -> [2] -> [3] // after this you simply change the direction of the .next or arrows
    - [1] <- [2] <- [3] // and thus the linked list gets reversed
*/