package bit.com;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
}


public class isPalindrome {


    public static void main(String[] args) {
        ListNode head = new ListNode(1);

    }

    public static boolean isPalindrome(ListNode head){
        if(head == null || head.next == null) {
            return true;
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode f = head;
        ListNode l = head;
        while (f != null && f.next!= null && l.next != null) {
            f = f.next.next;
            l = l.next;
        }

        dummyHead.next = l;
        ListNode mid = dummyHead.next;
        ListNode s = mid.next;

        while (s != null) {
            mid.next = s.next;
            s.next = dummyHead.next;
            dummyHead.next = s;
            s = mid.next;
        }
        while (head.next != null && dummyHead.next.next != null) {
            if(head.val != dummyHead.next.val) {
                return false;
            }
            head = head.next;
            dummyHead.next = dummyHead.next.next;
        }
        if (head.val != dummyHead.next.val) {
            return false;
        }
        return true;
    }
}
