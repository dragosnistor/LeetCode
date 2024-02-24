public class Solution1290 {

    public static void main(String[] args) {
        ListNode end = new ListNode(1);
        ListNode middle = new ListNode(0, end);
        ListNode head = new ListNode(1, middle);
        int ans = getDecimalValue(head);
        System.out.println(ans);    
    }
    

    static public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        sb.append(head.val);

        while (head.next != null) {
            sb.append(head.next.val);
            head = head.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    static public int getDecimalValue2(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = num * 2 + head.next.val;
            head = head.next;    
        }
        return num;
    }

    static public int getDecimalValue3(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            // int left = (num << 1);
            // int right = head.next.val;
            // num = left | right;
            num = (num << 1) | head.next.val;
            head = head.next;    
        }
        return num;
    }



    
}

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
   