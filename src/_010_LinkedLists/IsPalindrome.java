package _010_LinkedLists;

public class IsPalindrome {
    private static Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static boolean ispalindrome(Node head){

        if (head == null || head.next == null){
            return true;
        }
//        find mid
        Node mid = findMid(head);

//        reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;   /// head of right half

//        check left and right halves for palindrome testing
        Node left = head;
        while (right != null){
            if (left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }
}
