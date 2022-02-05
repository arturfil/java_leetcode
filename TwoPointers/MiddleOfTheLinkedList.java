package TwoPointers;

import LinkedLists.ListNode;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode[] nodes = new ListNode[100]; // given max len is 100
        int i = 0;
        while(head != null) {
            nodes[i++] = head;
            head = head.next;
        }
        return nodes[i/2];
    }
}

/*
    TEST
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

    EXPLANATION
    - You are going to create an array of ListNode class with a 
    length of 100, given that that is a constraint from the problem.
    - You will iterate through the whole linked list and 
    once you have your new array of nodes, you simple return
    the node that is in the middle or second in the middle by using
    an extra int to keep a record of the lenght;
    since length (5 in this case) is bigger than 4 (last index)
    if we divide length (also saved by int "i") by two, we can always
    get either the midle index if odd length or the second mid index
    in the case we have a even length
*/