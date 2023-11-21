public class PrintImmutableLinkedListInReverse {

    public static void main(String[] args) {

        ImmutableListNode myFourth = new ImmutableListNode(4);
        ImmutableListNode myThird = new ImmutableListNode(3, myFourth);
        ImmutableListNode mySecond = new ImmutableListNode(2, myThird);
        ImmutableListNode myFirst = new ImmutableListNode(1, mySecond);
        printLinkedListInReverse(myFirst);
    }

    static public void printLinkedListInReverse(ImmutableListNode head) {
        int i = 0;
        int j = 0;

        if (head.getNext() == null){
            head.printValue();
            j++;
            return;
        }

        if (head.getNext() != null) {
            // head = head.getNext();
            i++;
            printLinkedListInReverse(head.getNext());
        }

        head.printValue();
        return;
    }
    
}


 // This is the ImmutableListNode's API interface.
 // You should not implement it, or speculate about its implementation.
 class ImmutableListNode {
    private int node;
    private ImmutableListNode next;

    public ImmutableListNode(int node) {
        this.node = node;
    }

    public ImmutableListNode(int node, ImmutableListNode next) {
        this.node = node;
        this.next = next;
    }

    // print the value of this node.
     public void printValue() {
        System.out.println(node);
     } 
     // return the next node.
     public ImmutableListNode getNext() {
        return next;        
     } 

 };
