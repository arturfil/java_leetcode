import LinkedLists.ListNode;
import LinkedLists.ReverseLinkedList;

public class Main {
    public static void main(String[] args) {

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

        head.printNodes(head);
    }

}