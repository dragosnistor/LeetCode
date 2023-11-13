import java.util.ArrayList;
import java.util.List;

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
public class MiddleOfTheLinkedList {
   
    public static void main(String[] args) {
        // ListNode sixthListNode = new ListNode(6);
        // ListNode fifthListNode = new ListNode(5, sixthListNode);
        // ListNode fifthListNode = new ListNode(5);
        // ListNode fourthListNode = new ListNode(4, fifthListNode);
        // ListNode thirdListNode = new ListNode(3, fourthListNode);
        ListNode thirdListNode = new ListNode(3);
        ListNode secondListNode = new ListNode(2, thirdListNode);
        // ListNode secondListNode = new ListNode(2);
        ListNode firstListNode = new ListNode(1, secondListNode);
        // ListNode firstListNode = new ListNode(1);
        ListNode answer = middleNode(firstListNode);
        System.out.println(answer);
    }

    static public ListNode middleNode(ListNode head) {
        ListNode middle = head;

        while (head != null && head.next != null) {
            head = head.next.next;
            middle = middle.next;
        }

        return middle;
    }

    // static public ListNode middleNode(ListNode head) {
    //     List<ListNode> myListOfNodes = new ArrayList<>();

    //     while (head != null) {
    //         myListOfNodes.add(head);
    //         head = head.next;
    //     }

    //     return myListOfNodes.get(myListOfNodes.size() / 2);
    // }

}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
