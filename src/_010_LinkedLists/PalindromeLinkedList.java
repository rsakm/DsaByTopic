package _010_LinkedLists;

public class PalindromeLinkedList {
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // middle
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        Node secondHalfHead = reverseList(slow);

        // Step 3: Compare both halves
        Node p1 = head;
        Node p2 = secondHalfHead;
        while (p2 != null) {
            if (p1.data != p2.data) return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

    private static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }

    public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(2);
            head.next.next.next = new Node(1);

            boolean result = isPalindrome(head);

            // Output the result
        System.out.println("Is the linked list a palindrome? " + (result ? "Yes" : "No"));

    }
}
