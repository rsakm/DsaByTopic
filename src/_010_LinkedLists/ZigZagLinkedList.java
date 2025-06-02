package _010_LinkedLists;

public class ZigZagLinkedList {
    public void zigzag(Node head){
//        Find middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null || fast.next.next != null){
            slow=slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

//        reverse 2nd half
        Node rightHalf = mid.next;
        mid.next = null;

        ///// reversing
        Node prev = null;
        Node curr = rightHalf;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        Node nextLeft, nextRight;

//        alternate merging
        while (left != null && right != null){
            nextLeft = left.next;        /// keep next of left
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }
}
