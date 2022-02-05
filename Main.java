import LinkedLists.ListNode;
import TwoPointers.MiddleOfTheLinkedList;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        var middle = new MiddleOfTheLinkedList();
        middle.middleNode(head);
    }

}