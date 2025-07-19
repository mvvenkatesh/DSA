import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(2,
                                        new ListNode(1)))));
        System.out.println(isPalindrome(head));
        printList(head);


    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode t = head;
        ListNode mid = middleNode(t);

        ListNode prev = null;
        ListNode current = mid;
        ListNode next = null;
        if(current!=null){
            next = current.next;
        }

        while(current!=null){
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                next=next.next;
            }
        }

        ListNode newHead = prev;
        ListNode fhead = head;
        printList(newHead);
        while(newHead!=null && fhead!=null){
            if(newHead.val != fhead.val){
                return false;
            }
            newHead = newHead.next;
            fhead = fhead.next;
        }


        return true;

    }

    public static ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }


}

   class ListNode {
     int val;
    ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
