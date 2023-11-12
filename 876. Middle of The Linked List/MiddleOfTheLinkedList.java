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
        ListNode sixthListNode = new ListNode(6);
        ListNode fifthListNode = new ListNode(5, sixthListNode);
        ListNode fourthListNode = new ListNode(4, fifthListNode);
        ListNode thirdListNode = new ListNode(3, fourthListNode);
        ListNode secondListNode = new ListNode(2, thirdListNode);
        ListNode firstListNode = new ListNode(1, secondListNode);
        ListNode answer = middleNode(firstListNode);
        System.out.println(answer);
    }
    
    static public ListNode middleNode(ListNode head) {
        List<ListNode> myListOfNodes = new ArrayList<ListNode>();

        ListNode myCurrentNode = head;
        while (myCurrentNode.next != null) {
            myListOfNodes.add(myCurrentNode);
            myCurrentNode = myCurrentNode.next;
        }
        myListOfNodes.add(myCurrentNode);

        int myMiddle = 0;
        int linkedListSize = myListOfNodes.size();

        if ((linkedListSize & 1) == 0){
            myMiddle = linkedListSize / 2;
        } else {
            myMiddle = (linkedListSize - 1) / 2;
        }

        return myListOfNodes.get(myMiddle);
    }

}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
